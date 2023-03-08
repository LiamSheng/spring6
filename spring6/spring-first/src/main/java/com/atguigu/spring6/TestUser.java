package com.atguigu.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    // 创建 Logger 对象
    private final Logger logger = LoggerFactory.getLogger(TestUser.class);
    @Test
    public void testUserObject() {
        // 1.加载 spring 配置文件, 创建对象.
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        // 2.获取 spring 创建的对象.
        User user = (User) context.getBean("user");
        System.out.println(user);
        // 3.使用对象调用方法进行测试.
        user.add();

        // 手动写入日志
        logger.info("*** 执行调用成功了...");
    }

    // 反射创建对象
    @Test
    public void testUserObjectReflection() throws Exception{
        // 获取类 Class 对象.
        Class<?> c = Class.forName("com.atguigu.spring6.User");
        // 调勇方法创建对象.
        User user = (User) c.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }
}
