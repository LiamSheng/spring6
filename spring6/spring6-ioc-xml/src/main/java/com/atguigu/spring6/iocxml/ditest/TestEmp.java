package com.atguigu.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean-ditest.xml");

        Emp emp = applicationContext.getBean("employeeP", Emp.class);
        System.out.println(emp.toString());
    }
}
