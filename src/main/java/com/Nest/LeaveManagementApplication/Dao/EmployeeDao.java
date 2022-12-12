package com.Nest.LeaveManagementApplication.Dao;

import com.Nest.LeaveManagementApplication.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
