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
}
