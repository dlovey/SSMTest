package org.lanqiao.service;

import org.lanqiao.bean.User;

import java.util.List;

/**
 * Created by lenovo on 2017/8/30.
 */
public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> getAllUser();
    /**
     * 根据id查询用户
     */
    User getUserById(int id);

    /**
     * 添加用户
     * @return
     */
    int addUser(User user);

    /**
     * 删除用户
     * @return
     */
    int delUserById(int id);

    /**
     * 更新用户
     * @return
     */
    int updateUser(User user);
    /**
     * 根据条件查询用户
     */
    List<User> getUserCondition(User user);
}

