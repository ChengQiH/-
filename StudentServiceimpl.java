package com.jiyun.day03.service.serviceimpl;

import com.jiyun.day03.dao.StudentDao;
import com.jiyun.day03.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceimpl implements StudentService{
    @Autowired
    StudentDao studentDao;
    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public int add(Student student1) {
        return studentDao.add(student1);
    }

    @Override
    public int edit(Student student1) {
        return studentDao.edit(student1);
    }

    @Override
    public int delete(Integer id) {
        return studentDao.delete(id);
    }


}
