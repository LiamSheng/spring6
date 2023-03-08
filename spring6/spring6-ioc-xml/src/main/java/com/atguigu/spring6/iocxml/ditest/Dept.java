package com.atguigu.spring6.iocxml.ditest;
public class Dept {
    private String deptName;

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void info() {
        System.out.println("Dept name:" + deptName);
    }
}
