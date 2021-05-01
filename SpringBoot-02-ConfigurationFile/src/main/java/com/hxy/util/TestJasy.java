package com.hxy.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class TestJasy {
    public static void main(String[] args) {
        BasicTextEncryptor jasy=new BasicTextEncryptor();
        jasy.setPassword("123456");
        String name=jasy.encrypt("root");
        String password=jasy.encrypt("123");

        System.out.println(name);
        System.out.println(password);
    }
}
