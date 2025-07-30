package com.spring.entity;

import org.springframework.http.ResponseEntity;

public class Employee {

    private int id;
    private String fName;

    private String lName;
    private String City;

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", City='" + City + '\'' +
                '}';
    }

    public Employee(int id, String fName, String lName, String city) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        City = city;
    }
}
