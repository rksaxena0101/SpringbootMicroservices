package com.dailycodedebugger.departmentservice.model;

import java.util.*;

public class Department {
    private long id;
    private  String name;
    private List<Employee> employee = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employee=" + employee +
                '}';
    }

    public Department(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {
    }
}
