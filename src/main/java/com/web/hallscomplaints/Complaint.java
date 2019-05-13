package com.web.hallscomplaints;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "complaints")
public class Complaint {
	
	private String title;
	private String complaint_report;
	private String reg_no;
	private String hostelHall;
	private String hostelBlock;
	private Date date_of_report;

	public Complaint(String title, String complaint_report, String reg_no, String hostelHall, String hostelBlock,
			Date date_of_report) {
		super();
		this.title = title;
		this.complaint_report = complaint_report;
		this.reg_no = reg_no;
		this.hostelHall = hostelHall;
		this.hostelBlock = hostelBlock;
		this.date_of_report = date_of_report;
	}
	 @Id
	 @GeneratedValue
	 @Column(name = "reg_no")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComplaint_report() {
		return complaint_report;
	}

	public void setComplaint_report(String complaint_report) {
		this.complaint_report = complaint_report;
	}

	public String getReg_no() {
		return reg_no;
	}

	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}

	public String getHostelHall() {
		return hostelHall;
	}

	public void setHostelHall(String hostelHall) {
		this.hostelHall = hostelHall;
	}

	public String getHostelBlock() {
		return hostelBlock;
	}

	public void setHostelBlock(String hostelBlock) {
		this.hostelBlock = hostelBlock;
	}
	
	public Date getDate() {
		return date_of_report;
	}
	
	public void setDate(String string) {
		this.date_of_report = date_of_report;
	}

	public Complaint() {
		
	}

}
