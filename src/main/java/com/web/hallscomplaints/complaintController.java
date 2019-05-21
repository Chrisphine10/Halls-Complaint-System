package com.web.hallscomplaints;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ComplaintController {
	@RequestMapping("complaintview")
		
		public String complaintview() {
			System.out.println("Hey");
			return "complaintview.jsp";
		}
	public static void dataInsert() {
		
        Complaint com = new Complaint();
	    
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
	    LocalDate date = LocalDate.now();
	    com.setCurrentDate(date.format(formatter)); 
		
	    com.setComplaint_report("heyyyyyy there");
	    com.setTitle("Report");
	    com.setReg_no(53363);
	    com.setHostelBlock("sfgs");
	    com.setHostelHall("shsjk");
	 
	}
}
