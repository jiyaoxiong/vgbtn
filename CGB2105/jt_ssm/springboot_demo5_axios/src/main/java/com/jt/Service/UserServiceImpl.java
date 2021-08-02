package com.jt.Service;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {

        //利用MP获取数据库记录
        return userMapper.selectList(null);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }
}
