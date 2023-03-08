package com.atguigu.spring6.iocxml.auto.controller;

import com.atguigu.spring6.iocxml.auto.service.UserService;

public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser() {
        System.out.println("Controller 执行了");
        /*
            原生写法
            UserService userService = new UserServiceImpl();
            userService.addUserService();
        */
        userService.saveUser();
    }
}
