package com.jt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@AutoConfigurationPackage

@SpringBootApplication
@MapperScan("com.jt.mapper")
/**
 * SpringBoot为简化代码，提供了包扫描机制，为包路径下的接口创建代理对象
 * 之后交给Spring容器管理，可以在任意位置依赖注入
 * */
public class RunApp {
    public static void main(String[] args) {
        SpringApplication.run(RunApp.class,args);
    }
}

