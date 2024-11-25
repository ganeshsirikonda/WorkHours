package com.WH.WorkHours.Logging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



@Component
@Service
public class EmployeeLogService {
	
	@Autowired
	private EmployeeLogRepo repo;

//	public boolean validateEmployee(int ginno, String password) {
//        EmployeeLog employeeLog = repo.findByGinno(ginno);
//        System.out.println(employeeLog);
//        if ( employeeLog != null && employeeLog.getPassword().equals(password)) {
//            return true;
//        } else {
//            return false;
//        }
//        
//        
//    }
	
	  public void validateEmployee(String ginno, String password) {
	        EmployeeLog employeeLog = repo.findByGinno(ginno);
	        
	        
	        if (employeeLog == null || !employeeLog.getPassword().equals(password)) {
	            throw new InvalidCredentialsException("Invalid GIN number or password.");
	        }
	    }

}
