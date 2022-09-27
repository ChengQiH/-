package com.jiyun.day03.service.serviceimpl;

import com.jiyun.day03.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    int add(Student student1);

    int edit(Student student1);


    int delete(Integer id);
}
