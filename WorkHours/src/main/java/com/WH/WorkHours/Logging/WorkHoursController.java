package com.WH.WorkHours.Logging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("http://localhost:4200")
public class WorkHoursController {
	
	
	@Autowired
    private EmployeeLogService service;

	
//	@PostMapping("EmployeeLogValidate")
//	public boolean LogValidation(@RequestBody EmployeeLog log)
//	{
//		
//		return service.validateEmployee(log.getGinno(),log.getPassword());
//		  
//
//	}
	
	
	
	@PostMapping("EmployeeLogValidate")
	public ResponseEntity<?> login(@RequestBody EmployeeLoginDTO log) {
	    service.validateEmployee(log.getGinno(), log.getPassword());
//	    return new ResponseEntity<Object>(HttpStatus.OK);
	    return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}


}
