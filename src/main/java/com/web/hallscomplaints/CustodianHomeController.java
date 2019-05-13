package com.web.hallscomplaints;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustodianHomeController {
	@RequestMapping("custodianhome")
	
	public String custodianhome() {
		System.out.println("Hey");
		return "custodianhome.jsp";
	}
	
}
