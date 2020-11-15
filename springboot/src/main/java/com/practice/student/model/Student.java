package com.practice.student.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    private long stuId; // pk

    private int stuGrade; // 학년
    private int stuClass; // 반
    private String stuName; // 이름
}
