package com.WorkHours.EmployeeWorkHours.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WorkHours.EmployeeWorkHours.DTO.EmployeeDTO;
import com.WorkHours.EmployeeWorkHours.model.EmployeeLog;

@Repository
public interface EmployeeLogRepo extends JpaRepository<EmployeeLog,Integer> {
	
	

}
