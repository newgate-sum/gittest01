package com.itheima.mybatis.dao;


import java.util.List;

import com.itheima.mybatis.pojo.User;

    public interface UserDao {

        public User findUserById(Integer id);

        public List<User> findUserByName(String name);

        public void insertUser(User user);

        public List<User> getAllUser();
    }



