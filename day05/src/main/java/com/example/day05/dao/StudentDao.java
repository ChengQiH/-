package com.example.day05.dao;

import com.example.day05.pojo.Student;

import java.util.List;

public interface StudentDao {

    List<Student> findAll();

    int add(Student student);

    int edit(Student student);

    int delete(Integer id);
}
