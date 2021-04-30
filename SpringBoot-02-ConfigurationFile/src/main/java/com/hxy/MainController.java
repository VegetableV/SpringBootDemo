package com.hxy;

import com.hxy.config.FoodConifg;
import com.hxy.domain.Food;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FoodConifg.class})
public class MainController {

    public static void main(String[] args) {
        SpringApplication.run(MainController.class,args);
    }

}