package com.practice.student.controller;

import com.practice.student.model.Student;
import com.practice.student.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ApiOperation(value = "전체 학생 조회", tags = "Student")
    public List<Student> selectStudentAll(){
        return studentService.selectStudentAll();
    }

    @RequestMapping(value = "/{stuId}", method = RequestMethod.GET)
    @ApiOperation(value = "특정 학생 조회", tags = "Student")
    public Student selectStudentOne(@PathVariable("stuId") Long stuId){
        return studentService.selectStudentOne(stuId);
    }

    @RequestMapping(value = "/" , method = RequestMethod.POST)
    @ApiOperation(value = "학생 추가", tags = "Student")
    public void insertStudent(@RequestBody Student student){
        studentService.insertStudent(student);
    }

    @RequestMapping(value = "/" , method = RequestMethod.PUT)
    @ApiOperation(value = "학생 수정", tags = "Student")
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    @RequestMapping(value = "/{stuId}" , method = RequestMethod.DELETE)
    @ApiOperation(value = "학생 삭제", tags = "Student")
    public void deleteStudent(@PathVariable("stuId") Long stuId){
        studentService.deleteStudent(stuId);
    }
}
