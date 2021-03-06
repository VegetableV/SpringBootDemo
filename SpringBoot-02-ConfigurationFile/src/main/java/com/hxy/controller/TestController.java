package com.hxy.controller;

import com.hxy.config.FoodConifg;
import com.hxy.config.StudentConfig;
import com.hxy.domain.Food;
import com.hxy.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
//
//    @Value("${food.rice}")
//    private String rice;

    @Autowired
    private FoodConifg foodConifg;
//    @Autowired
//    private Food food;

    @Autowired
    private StudentConfig stu;


    @RequestMapping("/food")
    public Food food(){
        Food food=new Food();
        food.setRice(foodConifg.getRice());
        return food;
    }



    @RequestMapping("/student")
    public Student student(){
        Student student1=new Student();
        student1.setName(stu.getName());
        student1.setAge(stu.getAge());
        student1.setColor(stu.getColor());
        return student1;
    }

    @Value("${info.username}")
    private String username;

    @Value("${info.password}")
    private String password;

    @RequestMapping("/jasy")
    public String jasy(){
        return username+"         "+password;
    }







}
