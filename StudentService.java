package com.jiyun.day05.service;

import com.jiyun.day05.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    int add(Student student);

    int edit(Student student);

    int deleteStudent(Integer id);
}
