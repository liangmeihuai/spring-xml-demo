package com.wzq.spring.dao;

import com.wzq.spring.model.User;

/**
 * @author: wangzhenqing
 * @data:
 * @Description:
 */
public interface UserDao {

    public User getUserName(String username);

    public boolean modifyUser(User user);

    public boolean deleteUser(String username);

    public boolean addUser(User user);

}
