package com.exampl.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guest {
    private Integer id;    //嘉宾的业务id
    private String uname;  //嘉宾的名字
    private String role;   //嘉宾的角色
}
