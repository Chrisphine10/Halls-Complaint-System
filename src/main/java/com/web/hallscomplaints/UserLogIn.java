package com.web.hallscomplaints;

public class UserLogIn {
	private int reg_no;
	private String password;
	private String id_no;
	
	public UserLogIn() {
		
	}
	
	public UserLogIn(int reg_no, String password, String id_no) {
		super();
		this.reg_no = reg_no;
		this.password = password;
		this.id_no = id_no;
	}
	public int getReg_no() {
		reg_no = 7;
		return reg_no;
	}
	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId_no() {
		return id_no;
	}
	public void setId_no(String id_no) {
		this.id_no = id_no;
	}

	
}
