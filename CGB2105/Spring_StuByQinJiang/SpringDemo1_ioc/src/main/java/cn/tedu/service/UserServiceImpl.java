package cn.tedu.service;

import cn.tedu.dao.UserDao;
import cn.tedu.dao.UserDaoImpl;
import cn.tedu.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {
//    调用UserDaoImpl、UserDaoMysqllmpl就需要相应修改如下右部分--初始化的内容，耦合性太强了
//    private UserDao userDao = new UserDaoMysqlImpl();
//    @Override
//    public void getUser() {
//        userDao.getUser();
//    }

    private UserDao userDao;
    //利用set实现
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }

}
