package com.hxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.hxy.mapper")
public class Springboot04MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot04MybatisApplication.class, args);
	}

}
