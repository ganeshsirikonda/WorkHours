package com.WH.WorkHours.Logging;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeLogRepo extends JpaRepository<EmployeeLog,String>{


//	EmployeeLog findByGinno(int ginno);
	
	EmployeeLog findByGinno(String ginno);

	

}
