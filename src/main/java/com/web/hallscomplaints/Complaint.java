package com.web.hallscomplaints;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Complaint{
	
	@Id
	private int reg_no;
	private String title;
	private String complaint_report;
	private String hostel_hall;
	private String hostel_block;
	private String date_of_report;
	private String status;
	private String custodian_report;
	private String admin_report;
	private int complaint_no;

    public Complaint() {
		
	}
	public Complaint(String title, String admin_report, int complaint_no, String status, String custodian_report, String complaint_report, int reg_no, String hostel_hall, String hostel_block, String date_of_report) 
	{

		this.title = title;
		this.complaint_report = complaint_report;
		this.reg_no = reg_no;
		this.hostel_hall = hostel_hall;
		this.hostel_block = hostel_block;
		this.date_of_report = date_of_report; 
		this.admin_report = admin_report;
		this.custodian_report = custodian_report;
		this.status = status;
		this.complaint_no = complaint_no;
		
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
	 public int getReg_no() {
			return reg_no;
	}

		public void setReg_no(int reg) {
			this.reg_no = reg;
	}
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

	/**
	 * @return the date_of_report
	 */
	public String getDate_of_report() {
		return date_of_report;
	}
	/**
	 * @param date_of_report the date_of_report to set
	 */
	public void setDate_of_report(String date_of_report) {
		this.date_of_report = date_of_report;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the custodian_report
	 */
	public String getCustodian_report() {
		return custodian_report;
	}
	/**
	 * @param custodian_report the custodian_report to set
	 */
	public void setCustodian_report(String custodian_report) {
		this.custodian_report = custodian_report;
	}
	/**
	 * @return the admin_report
	 */
	public String getAdmin_report() {
		return admin_report;
	}
	/**
	 * @param admin_report the admin_report to set
	 */
	public void setAdmin_report(String admin_report) {
		this.admin_report = admin_report;
	}
	/**
	 * @return the complaint_no
	 */
	public int getComplaint_no() {
		return complaint_no;
	}
	/**
	 * @param complaint_no the complaint_no to set
	 */
	public void setComplaint_no(int complaint_no) {
		this.complaint_no = complaint_no;
	}
	
	@Override
	public String toString() {
		return "Complaint [reg_no=" + reg_no + ", title=" + title + ", complaint_report=" + complaint_report
				+ ", hostel_hall=" + hostel_hall + ", hostel_block=" + hostel_block + ", date_of_report="
				+ date_of_report + ", status=" + status + ", custodian_report=" + custodian_report + ", admin_report="
				+ admin_report + ", complaint_no=" + complaint_no + "]";
	}
	
}
