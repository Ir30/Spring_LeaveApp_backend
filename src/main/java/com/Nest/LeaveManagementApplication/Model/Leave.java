package com.Nest.LeaveManagementApplication.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Leave")
public class Leave {

    @Id
    @GeneratedValue()
    private int id;
    private String emp_code;
    private String from_date;
    private String to_date;
    private String apply_date;
    private String typeOf_leave;
    private int status=0;


    public Leave() {
    }

    public Leave(int id, String emp_code, String from_date, String to_date, String apply_date, String typeOf_leave, int status) {
        this.id = id;
        this.emp_code = emp_code;
        this.from_date = from_date;
        this.to_date = to_date;
        this.apply_date = apply_date;
        this.typeOf_leave = typeOf_leave;
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public String getEmp_code() {
        return emp_code;
    }

    public String getFrom_date() {
        return from_date;
    }

    public String getTo_date() {
        return to_date;
    }

    public String getApply_date() {
        return apply_date;
    }

    public String getTypeOf_leave() {
        return typeOf_leave;
    }

    public int getStatus() {
        return status;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setEmp_code(String emp_code) {
        this.emp_code = emp_code;
    }

    public void setFrom_date(String from_date) {
        this.from_date = from_date;
    }

    public void setTo_date(String to_date) {
        this.to_date = to_date;
    }

    public void setApply_date(String apply_date) {
        this.apply_date = apply_date;
    }

    public void setTypeOf_leave(String typeOf_leave) {
        this.typeOf_leave = typeOf_leave;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
