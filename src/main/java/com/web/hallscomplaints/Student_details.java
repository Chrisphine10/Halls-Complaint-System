package com.web.hallscomplaints;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student_details {
	
	@Id
	private int reg_no;
	private String fname;
	private String lname;
	private String password;
	private String hostel_hall;
	private String hostel_block;
	
	public Student_details() {
		
	}
	
	public Student_details(int reg_no, String fname, String lname, String password, String hostel_hall,
			String hostel_block) {
		super();
		this.reg_no = reg_no;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.hostel_hall = hostel_hall;
		this.hostel_block = hostel_block;
	}
	public int getReg_no() {
		return reg_no;
	}
	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHostel_hall() {
		return hostel_hall;
	}
	public void setHostel_hall(String hostel_hall) {
		this.hostel_hall = hostel_hall;
	}
	public String getHostel_block() {
		return hostel_block;
	}
	public void setHostel_block(String hostel_block) {
		this.hostel_block = hostel_block;
	}
	@Override
	public String toString() {
		return "StudentRegistration [reg_no=" + reg_no + ", fname=" + fname + ", lname=" + lname + ", password="
				+ password + ", hostel_hall=" + hostel_hall + ", hostel_body=" + hostel_block + "]";
	}
	
	
}
