package com.example.controller;

import com.example.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

//    @RequestMapping("/thymeleaf")
//    public String thyme(Model model){
//        model.addAttribute("name","<h1>张三</h1>");
//        return "/thymeleaf/index";
//    }

    @RequestMapping("student")
    public String thme(Model model){
        Student student=new Student();
        student.setName("李四");
        student.setAge(18);
        model.addAttribute("student",student);
        return "/thymeleaf/student";
    }

    @RequestMapping("/index")
    public String index(){
        return "/thymeleaf/index";
    }



}
