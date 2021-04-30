package com.hxy.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "food")
@Getter
@Setter
public class Food {
    private String rice;


}
