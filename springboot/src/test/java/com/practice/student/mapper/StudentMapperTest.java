package com.practice.student.mapper;

import com.practice.student.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentMapperTest {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    SqlSession session;

    @Test
    public void a(){
//         session.getMapper(Student.class);
        List<Student> students = studentMapper.selectStudentAll();

    }
}