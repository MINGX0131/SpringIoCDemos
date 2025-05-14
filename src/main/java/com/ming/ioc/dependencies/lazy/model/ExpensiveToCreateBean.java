package com.ming.ioc.dependencies.lazy.model;

public class ExpensiveToCreateBean {
    public ExpensiveToCreateBean() {
        System.out.println("ExpensiveToCreateBean initialized");
    }
}