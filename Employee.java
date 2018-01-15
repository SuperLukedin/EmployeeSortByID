package com.Luke;

import java.util.List;

public class Employee {
    private String name;
    private int id;
    private String email;

    public Employee(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public int getId() {
        return id;
    }

}
