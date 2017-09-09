package org.lanqiao.dao;

import org.apache.ibatis.javassist.ClassPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springMybatis.xml"})
public class IUserDaoTest {

@Autowired
    IUserDao userDao;
    @Test
    public void updateUserByCond() throws Exception {
        User user =new User(111,"dum");
        System.out.println(user.toString());
        System.out.println(userDao.updateUserByCond(user));
    }
    @Test
    public void getUserIn() throws Exception {
        List<Integer> list =new ArrayList<Integer>();
        list.add(111);
        list.add(222);
        list.add(333);
        System.out.println(userDao.getUserIn(list));

    }
}