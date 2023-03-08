package com.atguigu.spring6.iocxml.auto.dao;

public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser(){
        System.out.println("UserDao 执行了");
    }
}
