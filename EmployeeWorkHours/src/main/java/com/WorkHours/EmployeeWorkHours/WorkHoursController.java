package com.WorkHours.EmployeeWorkHours;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WorkHours.EmployeeWorkHours.DTO.EmployeeDTO;
import com.WorkHours.EmployeeWorkHours.Repo.EmployeeLogRepo;
import com.WorkHours.EmployeeWorkHours.Service.EmployeeLogService;
import com.WorkHours.EmployeeWorkHours.model.EmployeeLog;

//@CrossOrigin("http://localhost:8080")
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/")
public class WorkHoursController {
	@Autowired
	private EmployeeLogService service;
	
	@Autowired
	private EmployeeLogRepo repo;
	

	
	
	@PostMapping("EmployeeLog")
	public void getEmployeeLog(@RequestBody EmployeeLog log) {
		System.out.println("in employeelog");
	   repo.save(log);
	}
	
	
	@PostMapping("validateEmployeeLog")
    public boolean validateEmployeeLog(@RequestBody EmployeeLog log) {
	System.out.println(log);
        return service.validateEmployee(log.getGinNo(), log.getPassword());
    }
	
	
	
	
	

}
