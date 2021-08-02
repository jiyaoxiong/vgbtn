package com.jt.controller;

import com.jt.pojo.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AxiosController {
    /**
     * 查询用户信息
     * URL：http://localhost:8090/axios/getUser
     * */
    @GetMapping("/axios/getUser")
    public String getUser(){
        return "hello,ajax";
    }

    /**
     * 查询用户信息
     * URL:http://localhost:8090/axios/getUserById?id=100
     * 参数：id=100
     * 返回值：String
     * */
    @GetMapping("/axios/getUserById")
    public String getUserById(Integer id){
        return "axios获取id:" + id;
    }

    /**
     * restFul ajax传参
     * url:http://localhost:8090/axios/user/tomcat/18
     * 参数：name/age
     * 返回值：User对象
     * */
    @GetMapping("/axios/user/{name}/{age}")
    public User getUser2(User user){
        return user;
    }
}
