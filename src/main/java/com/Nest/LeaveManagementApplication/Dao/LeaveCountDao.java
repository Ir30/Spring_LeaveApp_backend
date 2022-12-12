package com.Nest.LeaveManagementApplication.Dao;

import com.Nest.LeaveManagementApplication.Model.LeaveCount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface LeaveCountDao extends CrudRepository<LeaveCount,Integer> {


    @Query(value = "INSERT INTO `leave_count`(`emp_code`,) VALUES (emp_code)",nativeQuery = true)
    public void setLeaveCount(@Param("emp_code")String emp_code);
}
