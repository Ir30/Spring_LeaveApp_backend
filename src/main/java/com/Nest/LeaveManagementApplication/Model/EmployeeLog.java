package com.Nest.LeaveManagementApplication.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EmployeeLog")
public class EmployeeLog {

    @Id
    @GeneratedValue()
    private int id;
    private String emp_code;
    private String entry;
    private String exit;


    public EmployeeLog() {
    }

    public EmployeeLog(int id, String emp_code, String entry, String exit) {
        this.id = id;
        this.emp_code = emp_code;
        this.entry = entry;
        this.exit = exit;
    }


    public int getId() {
        return id;
    }

    public String getEmp_code() {
        return emp_code;
    }

    public String getEntry() {
        return entry;
    }

    public String getExit() {
        return exit;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setEmp_code(String emp_code) {
        this.emp_code = emp_code;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }
}
