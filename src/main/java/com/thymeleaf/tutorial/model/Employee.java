package com.thymeleaf.tutorial.model;


import lombok.Data;


public class Employee {
private String name;
private String mob;

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getMob() {
        return mob;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", mob='" + mob + '\'' +
                '}';
    }

    public Employee(String name) {
        this.name = name;
    }
}
