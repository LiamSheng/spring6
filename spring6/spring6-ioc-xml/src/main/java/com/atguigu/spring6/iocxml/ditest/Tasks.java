package com.atguigu.spring6.iocxml.ditest;

public class Tasks {
    private String taskName;

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "taskName='" + taskName + '\'' +
                '}';
    }
}

