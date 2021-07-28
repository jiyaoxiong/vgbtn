package com.jt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jt.mapper") //Spring容器内部为接口创建代理对象
public class SpringBootRun {

    //标准写法
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRun.class, args);
    }
}
