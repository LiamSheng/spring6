package com.atguigu.spring6.iocxml.ditest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Emp {
    private String empName;
    private Integer age;
    public String[] hobbies;
    private Dept dept;

    @Override
    public String toString() {
        return "Emp{" +
                "EmpName='" + empName + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", dept=" + dept +
                ", tasksList=" + tasksList +
                ", deptMap=" + deptMap +
                '}';
    }

    private List<Tasks> tasksList;

    private Map<String, Dept> deptMap;

    public void setDeptMap(Map<String, Dept> deptMap) {
        this.deptMap = deptMap;
    }


    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setTasksList(List<Tasks> tasksList) {
        this.tasksList = tasksList;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public void work() {
        System.out.println("A Emp is working: {" + empName + age + "}");
        dept.info();
        System.out.println("Hobbies: " + Arrays.toString(hobbies));
    }
}
