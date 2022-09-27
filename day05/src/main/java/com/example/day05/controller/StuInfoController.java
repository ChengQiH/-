package com.example.day05.controller;

import com.example.day05.pojo.StuInfo;
import com.example.day05.pojo.Student;
import com.example.day05.service.StuInfoService;
import com.example.day05.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//day10作业
@RestController
@RequestMapping("stuInfo")
public class StuInfoController {

    @Autowired
    private StuInfoService stuInfoService;

    @Autowired
    private StudentService studentService;

    @RequestMapping("stuInfoAll")
    public Object stuInfoAll(){
        return stuInfoService.stuInfoAll();
    }

    @RequestMapping("addStuInfo")
    public Object addStuInfo(){
        StuInfo si=new StuInfo();
        List<Student> all = studentService.findAll();
        si.setStuid(all.get(1).getStuId());
        si.setStudent(all.get(1));
        return stuInfoService.addStuInfo(si);
    }
}
