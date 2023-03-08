package com.atguigu.spring6.iocxml.FactoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-FactoryBean.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
