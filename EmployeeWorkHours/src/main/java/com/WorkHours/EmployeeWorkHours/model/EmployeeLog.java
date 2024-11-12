package com.WorkHours.EmployeeWorkHours.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class EmployeeLog {
	@Id
	@Column(name="gin_no")
	private int ginNo;
//	private String userName;
	private String password;
	
	EmployeeLog(){}
	
	
	@Override
	public String toString() {
		return "EmployeeLog [ginNo=" + ginNo + ", password=" + password + "]";
	}
	public int getGinNo() {
		return ginNo;
	}
	public void setGinNo(int ginNo) {
		this.ginNo = ginNo;
	}
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	

}
