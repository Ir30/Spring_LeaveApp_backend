package com.Nest.LeaveManagementApplication;


import com.Nest.LeaveManagementApplication.Dao.EmoloyeeLogDao;
import com.Nest.LeaveManagementApplication.Dao.EmployeeDao;
import com.Nest.LeaveManagementApplication.Dao.LeaveCountDao;
import com.Nest.LeaveManagementApplication.Dao.LeaveDao;
import com.Nest.LeaveManagementApplication.Model.Employee;
import com.Nest.LeaveManagementApplication.Model.EmployeeLog;
import com.Nest.LeaveManagementApplication.Model.Leave;
import com.Nest.LeaveManagementApplication.Model.LeaveCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class controller {



    @Autowired
    private EmployeeDao edao;

    @Autowired
    private LeaveCountDao lcdao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addEmployee",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> AddEmployee(@RequestBody Employee e){

        edao.save(e);

        LeaveCount l = new LeaveCount();
        l.setEmp_code(e.getEmp_code().toString());
        lcdao.save(l);


        HashMap<String,String> res = new HashMap<>();
        res.put("status","success");

        return res;
    }


    @Autowired
    private EmoloyeeLogDao eldao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/employee_log",produces = "application/json",consumes = "application/json")
    public HashMap<String,String> employeeLog(@RequestBody EmployeeLog el){
        eldao.save(el);
        HashMap<String,String> res = new HashMap<>();
        res.put("status","success");
        return res;
    }


    @Autowired
    private LeaveDao ldao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/leaveAdd",produces = "application/json",consumes = "application/json")
    public HashMap<String,String> leaveAdd(@RequestBody Leave l){
        ldao.save(l);
        HashMap<String,String> res = new HashMap<>();
        res.put("status","success");
        return res;
    }
}
