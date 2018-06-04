package com.itheima.mybatis.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itheima.mybatis.dao.UserDao;
import com.itheima.mybatis.pojo.User;

@Repository//@compent @service  @controller
public class UserDaoImpl extends BaseDaoImpl implements UserDao {

    @Override
    public User findUserById(Integer id) {
        SqlSession sqlSession = getSqlSession();
        User user = sqlSession.selectOne("test.selectUserById", id);
        //不需要再关闭资源  commit
        return user;
    }

    @Override
    public List<User> findUserByName(String name) {
        // 3.获取sqlsession
        SqlSession sqlSession = getSqlSession();
        // 4.操作数据库执行sql语句
        List<User> users = sqlSession.selectList("test.selectUserByName", name);

        return users;
    }

    @Override
    public void insertUser(User user) {
        // 3.获取sqlsession
        SqlSession sqlSession = getSqlSession();
        // 4.操作数据库执行sql语句
        sqlSession.insert("test.insertUser", user);
    }

    @Override
    public List<User> getAllUser() {
        SqlSession sqlSession = getSqlSession();
        List<User> list = sqlSession.selectList("test.getAllUser");
        return list;
    }

}
