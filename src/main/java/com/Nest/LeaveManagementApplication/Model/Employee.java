package com.Nest.LeaveManagementApplication.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {


    @Id
    @GeneratedValue()
    private int id;
    private String emp_code;
    private String name;
    private String emile;
    private String designation;
    private String username;
    private String password;

    public Employee() {
    }


    public Employee(int id, String emp_code, String name, String emile, String designation, String username, String password) {
        this.id = id;
        this.emp_code = emp_code;
        this.name = name;
        this.emile = emile;
        this.designation = designation;
        this.username = username;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public String getEmp_code() {
        return emp_code;
    }

    public String getName() {
        return name;
    }

    public String getEmile() {
        return emile;
    }

    public String getDesignation() {
        return designation;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setEmp_code(String emp_code) {
        this.emp_code = emp_code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmile(String emile) {
        this.emile = emile;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
