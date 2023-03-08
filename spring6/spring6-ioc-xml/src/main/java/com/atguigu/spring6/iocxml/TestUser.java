package com.atguigu.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean.xml");
        // 1. 根据 id 获取 Bean, 默认得到 Object 对象, 需要转换到 User 对象.
        User user1 = (User) context.getBean("user");
        System.out.println("根据 id 获取 Bean:" + user1);

        // 2. 根据类型获取 Bean.
        User user2 = context.getBean(User.class);
        System.out.println("根据 id 获取 Bean:" + user2);

        // 3. 根据 id 和 类型 获取 Bean.
        User user3 = context.getBean("user", User.class);
        System.out.println("根据 id 和 类型 获取 Bean:" + user3);
    }
}
