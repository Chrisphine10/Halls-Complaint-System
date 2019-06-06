package com.web.hallscomplaints;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hostel {
	
	@Id
	private int hostel_id;
	private String hostel_hall;
	
	public Hostel() {
			
		}
	
	
	public Hostel(int hostel_id, String hostel_hall) {
		super();
		this.hostel_id = hostel_id;
		this.hostel_hall = hostel_hall;
	}
	public int getHostel_id() {
		return hostel_id;
	}
	public void setHostel_id(int hostel_id) {
		this.hostel_id = hostel_id;
	}
	public String getHostel_hall() {
		return hostel_hall;
	}
	public void setHostel_hall(String hostel_hall) {
		this.hostel_hall = hostel_hall;
	}
	@Override
	public String toString() {
		return "Hostel [hostel_id=" + hostel_id + ", hostel_hall=" + hostel_hall + "]";
	}
	
	
}
