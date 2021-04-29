package com.hxy.controller;

import com.hxy.domain.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
//
    @Value("${food.rice}")
    private String rice;

    @Autowired
    private Food food;


    @RequestMapping("/food")
    public Food food(){
        Food food=new Food();
        food.setRice(food.getRice());
        return food;
    }
}
