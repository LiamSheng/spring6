package com.atguigu.spring6.iocxml.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Book {
    private String bName;
    private String author;

    public Book() {
    }

    // 生成 set 方法:
    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String bName, String author) {
        System.out.println("Constructor with args...");
        this.bName = bName;
        this.author = author;
    }

    @Override
    public String toString() {
        return "{ " + "Book Name:" + bName + " " + "Author:" + author + " }";
    }

    public static void main(String[] args) {
        // 构造器注入:
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = applicationContext.getBean("bookConstructor", Book.class);
        System.out.println(book);
    }
}
