package com.web.hallscomplaints;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HallsOfficerHomeController {
@RequestMapping("hallsofficerhome")
	
	public String hallsofficerhome() {
		System.out.println("Hey");
		return "hallsofficerhome.jsp";
	}
	
}
