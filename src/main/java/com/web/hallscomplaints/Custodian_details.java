package com.web.hallscomplaints;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Custodian_details {
	
	@Id
	private int id_no;
	private String fname;
	private String lname;
	private String password;
	private String hostel_id;
	private String phone_number;
	
	public Custodian_details() {
			
		}
		
	
	public Custodian_details(int id_no, String fname, String lname, String password, String hostel_id,
			String phone_number) {
		super();
		this.id_no = id_no;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.hostel_id = hostel_id;
		this.phone_number = phone_number;
	}
	public int getId_no() {
		return id_no;
	}
	public void setId_no(int id_no) {
		this.id_no = id_no;
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
	public String getHostel_id() {
		return hostel_id;
	}
	public void setHostel_id(String hostel_id) {
		this.hostel_id = hostel_id;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	@Override
	public String toString() {
		return "CustodianRegistration [id_no=" + id_no + ", fname=" + fname + ", lname=" + lname + ", password="
				+ password + ", hostel_id=" + hostel_id + ", phone_number=" + phone_number + "]";
	}
	
	
}
