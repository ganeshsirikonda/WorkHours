package com.WorkHours.EmployeeWorkHours.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WorkHours.EmployeeWorkHours.Repo.EmployeeLogRepo;
import com.WorkHours.EmployeeWorkHours.model.EmployeeLog;

@Service
public class EmployeeLogService {
	
	  @Autowired
	    private EmployeeLogRepo repo;
	    
	    public boolean validateEmployee(int ginNo, String password) {
	        EmployeeLog employeeLog = repo.findById(ginNo).orElse(null);
	        return employeeLog != null && employeeLog.getPassword().equals(password);
	    }

	
	

}
