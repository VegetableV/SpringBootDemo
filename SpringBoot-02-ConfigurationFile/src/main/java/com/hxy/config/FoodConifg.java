package com.hxy.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "food")
@Getter
@Setter
public class FoodConifg {
    private String rice;

}
