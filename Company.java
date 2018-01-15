package com.Luke;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Company {
    private String name;
    private List<Employee> members = new ArrayList<>();// A company members created here.

    public Company(String name) {
        this.name = name;
    }
    public boolean addEmployee(Employee employee){
        if (members.contains(employee)){
            System.out.println("ID: " + employee.getId() + " is already on this company");
            return false;
        } else {
            members.add(employee);
            System.out.println(employee.getId() + " was added successfully");
            return true;
        }
    }

    public List<Employee> getMembers() {
        return members;
    }
}
