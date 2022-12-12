package com.Nest.LeaveManagementApplication.Dao;

import com.Nest.LeaveManagementApplication.Model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {

    @Query(value = "SELECT `emp_code` FROM `employee`  ORDER BY emp_code DESC LIMIT 1",nativeQuery = true)
    public List<Map<String,String>> getlastId();
}
