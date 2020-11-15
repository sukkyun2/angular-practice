package com.practice.student.service;

import com.practice.student.mapper.StudentMapper;
import com.practice.student.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> selectStudentAll(){
        return studentMapper.selectStudentAll();
    }

    public Student selectStudentOne(Long stuId){
        return studentMapper.selectStudentOne(stuId);
    }

    public void insertStudent(Student student){
        studentMapper.insertStudent(student);
    }

    public void updateStudent(Student student){
        studentMapper.updateStudent(student);
    }

    public void deleteStudent(Long stuId){
        studentMapper.deleteStudent(stuId);
    }




}
