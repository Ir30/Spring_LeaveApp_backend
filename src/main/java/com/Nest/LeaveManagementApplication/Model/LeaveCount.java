package com.Nest.LeaveManagementApplication.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LeaveCount")
public class LeaveCount {

    @Id
    @GeneratedValue()
    private int id;
    private String emp_code;
    private int sickLeave = 7;
    private int casualLeave = 20;
    private int specialLeave = 3;


    public LeaveCount() {
    }


    public LeaveCount(int id, String emp_code, int sickLeave, int casualLeave, int specialLeave) {
        this.id = id;
        this.emp_code = emp_code;
        this.sickLeave = sickLeave;
        this.casualLeave = casualLeave;
        this.specialLeave = specialLeave;
    }


    public int getId() {
        return id;
    }

    public String getEmp_code() {
        return emp_code;
    }

    public int getSickLeave() {
        return sickLeave;
    }

    public int getCasualLeave() {
        return casualLeave;
    }

    public int getSpecialLeave() {
        return specialLeave;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setEmp_code(String emp_code) {
        this.emp_code = emp_code;
    }

    public void setSickLeave(int sickLeave) {
        this.sickLeave = sickLeave;
    }

    public void setCasualLeave(int casualLeave) {
        this.casualLeave = casualLeave;
    }

    public void setSpecialLeave(int specialLeave) {
        this.specialLeave = specialLeave;
    }
}
