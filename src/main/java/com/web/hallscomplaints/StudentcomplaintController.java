package com.web.hallscomplaints;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentcomplaintController {
	@RequestMapping("/studentcomplaint")
	
	public String studentcomplaint() {
		System.out.println("HIIII");
		return "/studentcomplaint.jsp";
	}
}
