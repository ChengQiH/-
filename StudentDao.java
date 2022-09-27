package com.jiyun.day03.dao;

import com.jiyun.day03.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface StudentDao {

    List<Student> findAll();

    int add(Student student1);

    int edit(Student student1);


    int delete(Integer id);
}
