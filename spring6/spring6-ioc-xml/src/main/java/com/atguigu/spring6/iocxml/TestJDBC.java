package com.atguigu.spring6.iocxml;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJDBC {
    @Test
    public void demo01() {
        try (DruidDataSource dataSource = new DruidDataSource()) {
            // configure dataSource
            // use dataSource
            dataSource.setUrl("jdbc:mysql://localhost:3306/ssm?serverTimezone=UTC");
            dataSource.setUsername("root");
            dataSource.setPassword("root");
            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        }
    }

    @Test
    public void demo02() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidDataSource dataSource = applicationContext.getBean(DruidDataSource.class);
        System.out.println(dataSource.getUrl());
    }
}
