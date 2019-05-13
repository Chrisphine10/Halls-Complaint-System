package com.web.hallscomplaints;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminHomeController {
		@RequestMapping("adminhome")
		
		public String adminhome() {
			System.out.println("Hey");
			return "adminhome.jsp";
		}

}
