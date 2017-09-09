package org.lanqiao.service.impl;

import org.apache.log4j.Logger;
import org.lanqiao.bean.User;
import org.lanqiao.dao.IUserDao;
import org.lanqiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/8/30.
 */
@Service

public class UserServiceImpl implements UserService{
    Logger l=Logger.getLogger(UserServiceImpl.class);
    @Autowired
    private IUserDao userDao ;//接口不能通过实例化
    public List<User> getAllUser() {
        l.info("我饿了！");
        return userDao.getAllUser();
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    public int addUser(User user) {
        return userDao.addUser(user);
    }

    public int delUserById(int id) {
        return userDao.delUserById(id);
    }

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    public List<User> getUserCondition(User user) {
        return userDao.getUserCondition(user);
    }


}
