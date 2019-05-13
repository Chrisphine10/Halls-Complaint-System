package com.web.hallscomplaints;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class complaintController {
	@RequestMapping("complaintview")
		
		public String complaintview() {
			System.out.println("Hey");
			return "complaintview.jsp";
		}
		
}
