package com.ax.springbootdemo01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${usernames}")   //可用于基本数据类型注入
    private String usernames;

    @RequestMapping("/")
    public String helloworld() {
        return "HelloWorld   Spring Boot  qucik" + usernames;
    }

}
