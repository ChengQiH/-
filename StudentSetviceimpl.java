package com.jiyun.day02.service.serviceimpl;

import com.jiyun.day02.dao.StudentDao;
import com.jiyun.day02.pojo.Student;
import com.jiyun.day02.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSetviceimpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public int add(Student stu) {
        return studentDao.add(stu);
    }

    @Override
    public int edit(Student stu) {
        return studentDao.edit(stu);
    }

    @Override
    public int delete(int i) {
        return studentDao.delete(i);
    }
}
