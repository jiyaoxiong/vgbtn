package com.jt;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestSpringBoot {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFind(){
        List<User> userList = userMapper.getAll();
        for (User user:userList){
            System.out.println(user);
        }
    }
    @Test
    public void getByName(){
        List<User> byName = userMapper.getByName();
        for (User user:byName){
            System.out.println(user);
            System.out.println("getByName()========================");
        }
    }
    @Test
    public void getByOrder() {
        List<User> byName = userMapper.getByOrder();
        for (User user:byName){
            System.out.println(user);
            System.out.println("getByOrder()========================");
        }
    }
    @Test
    public void getByAnd1(){
        List<User> byName = userMapper.getByAnd1();
        for (User user:byName){
            System.out.println(user);
            System.out.println("getAnd1()========================");
        }
    }
    @Test
    public void getByAnd2(){
        List<User> byName = userMapper.getByAnd2();
        for (User user:byName){
            System.out.println(user);
            System.out.println("getAnd2()========================");
        }
    }
    @Test
    public void getById(){
        List<User> byName = userMapper.getById();
        for (User user:byName){
            System.out.println(user);
            System.out.println("getByid()========================");
        }
    }
}
