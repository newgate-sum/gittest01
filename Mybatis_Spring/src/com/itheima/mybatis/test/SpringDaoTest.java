package com.itheima.mybatis.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.mybatis.dao.UserDao;
import com.itheima.mybatis.pojo.User;

import java.util.List;

public class SpringDaoTest {
    @Test
    public void testDao(){
        //1.初始化spring容器
        ApplicationContext context= new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        //2.从容器中获取dao的实例
        UserDao bean = context.getBean(UserDao.class);

        //User user = bean.findUserById(1);
        //3.调用方法
       // System.out.println(user);
        List<User> allUser = bean.getAllUser();
        for (User user : allUser){
            System.out.println(user);
        }
    }
}
