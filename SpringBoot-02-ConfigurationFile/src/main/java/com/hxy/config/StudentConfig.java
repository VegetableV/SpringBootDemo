package com.hxy.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "student")
@PropertySource("classpath:Student.properties")
@Getter
@Setter
public class StudentConfig {
    private String name;
    private Integer age;


}
