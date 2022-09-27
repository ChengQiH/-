package com.example.day05.controller;

import com.example.day05.pojo.Student;
import com.example.day05.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//day5作业
@RequestMapping("student")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @CrossOrigin
    @RequestMapping("findAll")
    public Object findAll(){
        List<Student> list=studentService.findAll();
        return list;
    }
    @CrossOrigin
    @RequestMapping("add")
    public Object add(@RequestBody Student student){
        int i=0;
        i=studentService.add(student);
        return i;
    }
    @CrossOrigin
    @RequestMapping("edit")
    public Object edit(@RequestBody Student student){
        int i=0;
        i=studentService.edit(student);
        return i;
    }
    @CrossOrigin
    @RequestMapping("/delete/{id}")
    public Object delete(@PathVariable("id") Integer id){
        int i=0;
        i=studentService.delete(id);
        return i;
    }

}
