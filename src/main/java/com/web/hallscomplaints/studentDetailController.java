package com.web.hallscomplaints;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class StudentDetailController {
	@RequestMapping("studentdetail")
	
	public String studentdetail() {
		System.out.println("Hey");
		return "studentdetail.jsp";
	}
	
}
