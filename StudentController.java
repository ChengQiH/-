package com.jiyun.day02.controller;

import com.jiyun.day02.pojo.Student;
import com.jiyun.day02.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("student")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("findAll")
    public Object indAll(){
        List<Student> list=studentService.findAll();
        return list;
    }0
    @RequestMapping("add")
    public Object add(Student student){
        Student stu = new Student();
        stu.setId(2);
        stu.setName("张三");
        stu.setAge(10);
        stu.setDz("北京");
        stu.setDh("123456");
        int nt=studentService.add(stu);
        if (nt>0){
            return "成功";
        }else {
            return "失败";
        }

    }
    @RequestMapping("edit")
    public Object edit(Student student){
        Student stu = new Student();
        stu.setId(1);
        stu.setName("张三");
        int nt=studentService.edit(stu);
        if (nt>0){
            return "成功";
        }else {
            return "失败";
        }
    }
    @RequestMapping("delete")
    public Object delete(Integer id){
        int sss=studentService.delete(1);
                
        if (sss>0){
            return "成功";
        }else {
            return "失败";
        }
    }
}
