package com.Nest.LeaveManagementApplication.Dao;

import com.Nest.LeaveManagementApplication.Model.Leave;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LeaveDao extends CrudRepository<Leave,Integer> {

}
