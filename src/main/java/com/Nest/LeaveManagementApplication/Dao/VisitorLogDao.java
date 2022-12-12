package com.Nest.LeaveManagementApplication.Dao;

import com.Nest.LeaveManagementApplication.Model.VisitorLog;
import org.springframework.data.repository.CrudRepository;

public interface VisitorLogDao extends CrudRepository<VisitorLog,Integer> {
}
