package com.jiyun.day05.mapper;

import com.jiyun.day05.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> findAll();

    int add(Student student);

    int edit(Student student);

    int deleteStudent(Integer id);
}
