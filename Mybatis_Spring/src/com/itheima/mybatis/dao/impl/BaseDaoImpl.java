package com.itheima.mybatis.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class BaseDaoImpl extends SqlSessionDaoSupport {
    @Resource
    //@Autowired  按照类型查找
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
