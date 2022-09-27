package com.example.day05.service;

import com.example.day05.pojo.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    int add(Student student);

    int edit(Student student);

    int delete(Integer id);
}
