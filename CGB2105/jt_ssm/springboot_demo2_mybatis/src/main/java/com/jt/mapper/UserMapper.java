package com.jt.mapper;

import com.jt.pojo.User;

import java.util.List;
public interface UserMapper {
    //查询所有的user表数据
    List<User> getAll();
    List<User> getByName();
    List<User> getByOrder();
    List<User> getByAnd1();
    List<User> getByAnd2();
    List<User> getById();
}

