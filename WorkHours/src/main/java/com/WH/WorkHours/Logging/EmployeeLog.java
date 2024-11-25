package com.WH.WorkHours.Logging;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Component
@Entity
@Table(name="EmployeeLog")
public class EmployeeLog {
	
	@Id
	@Column(name="ginno")
	private String ginno;
	
	public String getGinno() {
		return ginno;
	}



	public void setGinno(String ginno) {
		this.ginno = ginno;
	}


	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Column(name="password")
	private String password;
	
	

	@Override
	public String toString() {
		return "EmployeeLog [ginno=" + ginno + ", password=" + password + "]";
	}

}
