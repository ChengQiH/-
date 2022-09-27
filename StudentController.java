package com.jiyun.day03.controller;

import com.jiyun.day03.pojo.Student;
import com.jiyun.day03.service.serviceimpl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("student")
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping("findAll")
    public List<Student> findAll(){
         List<Student> all=studentService.findAll();
        return all;
    }
    @RequestMapping("add")
    public Object add(){
        Student student1=new Student();
        student1.setName("王五");
        student1.setAge(12);
        student1.setDz("上海");
        student1.setDh("13654987");
        student1.setDid(1);
        student1.setDname("人工智能");
        int s=studentService.add(student1);
        if(s>0){
            return "成功";
        }else {
            return "失败";
        }
    }
    @RequestMapping("edit")
    public Object edit(){
        Student student1 = new Student();
        student1.setId(3);
        student1.setName("wwwwww");
        int s=studentService.edit(student1);
        if (s>0){
            return "成功";
        }else {
            return "失败";
        }
    }
    @RequestMapping("delete")
    public Object delete(Integer id) {
        int sss = studentService.delete(3);
        if (sss > 0) {
            return "成功";
        } else {
            return "失败";
        }
    }
}
