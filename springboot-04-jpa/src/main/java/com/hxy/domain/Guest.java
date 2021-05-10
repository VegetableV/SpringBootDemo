package com.hxy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Guest {
    @Id
    private Integer id;    //嘉宾的业务id
    @Column
    private String uname;  //嘉宾的名字
    @Column
    private String role;   //嘉宾的角色
}
