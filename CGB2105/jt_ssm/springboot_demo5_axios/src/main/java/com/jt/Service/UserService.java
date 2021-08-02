package com.jt.Service;

import com.jt.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    void insertUser(User user);
}
