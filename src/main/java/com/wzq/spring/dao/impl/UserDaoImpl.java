package com.wzq.spring.dao.impl;

import com.wzq.spring.dao.UserDao;
import com.wzq.spring.model.User;

/**
 * @author: wangzhenqing
 * @data: 2015-04-11 21:15:02
 * @Description: userDao实现类
 */
public class UserDaoImpl implements UserDao {

    public User getUserName(String username) {
        System.out.println("getUserName: username=" + username);
        return new User();
    }

    public boolean modifyUser(User user) {
        System.out.println("modifyUser: username=" + user.getUsername() + ", password=" + user.getPassword());
        return true;
    }

    public boolean deleteUser(String username) {
        System.out.println("deleteUser: username="+username);
        return true;
    }

    public boolean addUser(User user) {
        System.out.println("addUser: username=" + user.getUsername() + ", password=" + user.getPassword());
        return true;
    }
}
