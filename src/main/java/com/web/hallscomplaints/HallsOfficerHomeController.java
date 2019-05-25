package com.web.hallscomplaints;

import org.springframework.web.bind.annotation.RequestMapping;

public class HallsOfficerHomeController {
@RequestMapping("hallsofficerhome")
	
	public String hallsofficerhome() {
		System.out.println("Hey");
		return "hallsofficerhome.jsp";
	}
	
}
