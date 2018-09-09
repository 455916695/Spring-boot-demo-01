package com.ax.springbootdemo01.config;

import com.ax.springbootdemo01.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration    //这个注解表示 该类为配置类
public class MyConfig {

    @Bean     //表示向Spring容器中注入一个 ，HelloWorldService 对象，   对象名默认为方法名
    public HelloWorldService  helloWorldService () {
        return new HelloWorldService();
    }


}
