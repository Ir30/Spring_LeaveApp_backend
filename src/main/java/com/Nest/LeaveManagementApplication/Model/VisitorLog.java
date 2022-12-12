package com.Nest.LeaveManagementApplication.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VisitorLog")
public class VisitorLog {

    @Id
    @GeneratedValue()
    private int id;
    private String name;
    private String entry;
    private String exit;


    public VisitorLog() {
    }

    public VisitorLog(int id, String name, String entry, String exit) {
        this.id = id;
        this.name = name;
        this.entry = entry;
        this.exit = exit;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }
}
