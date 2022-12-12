package com.Nest.LeaveManagementApplication.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Security")
public class Security {


    @Id
    @GeneratedValue()
    private int id;
    private String security_id;
    private String name;
    private String username;
    private String password;

    public Security() {
    }


    public Security(int id, String security_id, String name, String username, String password) {
        this.id = id;
        this.security_id = security_id;
        this.name = name;
        this.username = username;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public String getSecurity_id() {
        return security_id;
    }

    public String getName() {
        return name;
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

    public void setSecurity_id(String security_id) {
        this.security_id = security_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
