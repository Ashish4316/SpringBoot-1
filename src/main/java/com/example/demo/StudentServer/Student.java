package com.example.demo.StudentServer;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

public class Student {

    int ID;
    String name;
    int age;
    String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

