package com.WorkHours.EmployeeWorkHours.DTO;

import org.springframework.stereotype.Component;


public class EmployeeDTO {
	
	private int gin_no;
	private String password;
	
	EmployeeDTO(){}
	
	
	public int getGin_no() {
		return gin_no;
	}
	
	public void setGin_no(int gin_no) {
		this.gin_no = gin_no;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "EmployeeDTO [gin_no=" + gin_no + ", password=" + password + "]";
	}
	

}
