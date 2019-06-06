package com.web.hallscomplaints;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentcomplaintController {
	@RequestMapping("complaint")
	
	public String complaint() {
		System.out.println("complaint page");
		return "studentcomplaint.jsp";
	}

}
