package com.WH.WorkHours.Logging;

public class EmployeeLoginDTO {
	private String ginno;
	private String password;
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
	
	public EmployeeLoginDTO() {}
	
	public EmployeeLoginDTO(String ginno, String password) {
		super();
		this.ginno = ginno;
		this.password = password;
	}
	@Override
	public String toString() {
		return "EmployeeLoginDTO [ginno=" + ginno + ", password=" + password + "]";
	}
	

}
