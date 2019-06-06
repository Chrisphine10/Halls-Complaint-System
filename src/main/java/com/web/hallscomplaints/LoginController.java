package com.web.hallscomplaints;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
@RequestMapping("loginpage")
	
	public String loginpage() {
		System.out.println("logging in ...");
		return "loginpage.jsp";
	}
}
