package com.itheima.mybatis.pojo;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
     * 用户信息
     * @title User.java
     * <p>description</p>
     * <p>company: www.itheima.com</p>
     * @author ljh
     * @version 1.0
     *
     *
     */
    public class User {
        private Integer id;
        private String username;// 用户姓名
        private String sex;// 性别
        private Date birthday;// 生日
        private String address;// 地址

       // private List<Orders> orders;//设置一对多关联映射
        private Map<String, Object> paraMap= new HashMap<>();


        public Map<String, Object> getParaMap() {
            return paraMap;
        }
        public void setParaMap(Map<String, Object> paraMap) {
            this.paraMap = paraMap;
        }
//        public List<Orders> getOrders() {
//                return orders;
//            }
//        public void setOrders(List<Orders> orders) {
//            this.orders = orders;
//        }
        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
        public String getUsername() {
            return username;
        }
        public void setUsername(String username) {
            this.username = username;
        }
        public String getSex() {
            return sex;
        }
        public void setSex(String sex) {
            this.sex = sex;
        }
        public Date getBirthday() {
            return birthday;
        }
        public void setBirthday(Date birthday) {
            this.birthday = birthday;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", paraMap=" + paraMap +
                '}';

    }

}



