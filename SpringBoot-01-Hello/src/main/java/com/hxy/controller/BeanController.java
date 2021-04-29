package com.hxy.controller;

import com.hxy.domain.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController {

    @RequestMapping("/student")
    public Student showStudnet(){
        Student student=new Student();
        student.setName("张三");
        student.setAge(18);
        return student;
    }
}
