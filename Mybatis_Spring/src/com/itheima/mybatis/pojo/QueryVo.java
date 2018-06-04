package com.itheima.mybatis.pojo;

import java.util.List;

public class QueryVo {
    private User user;

    private List<Integer> ids;//用户的ID集合



    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
