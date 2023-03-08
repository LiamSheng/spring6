package com.atguigu.spring6.iocxml.life;

public class User {
    // 无参构造器
    public User() {
        System.out.println("1. bean 对象创建, 调用无参构造器");
    }

    // 初始化方法
    public void initMethod() {
        System.out.println("4. bean 对象初始化 (需要在配置 bean 时指定初始化方法)");
    }

    // 销毁的方法
    public void destroyMethod() {
        System.out.println("7. bean 对象销毁 (需要再配置 bean 时指定销毁的方法)");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2. 通过 setter 给 bean 对象设置属性值");
        this.name = name;
    }

    private String name;
}
