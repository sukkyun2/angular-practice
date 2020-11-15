package com.practice.student.mapper;

import com.practice.student.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    public List<Student> selectStudentAll();
    public void insertStudent(Student student);
    public void updateStudent(Student student);
    public void deleteStudent(Long stuId);
    public Student selectStudentOne(Long stuId);
}
