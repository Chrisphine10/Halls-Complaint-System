package com.web.hallscomplaints;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class studentHistoryController {
	@RequestMapping("studenthistory")
	
	public String studenthistory() {
		System.out.println("Hey");
		return "studenthistory.jsp";
	}
	
	public class GreetingController {

	    @GetMapping("/greeting")
	    public String complaintview(@RequestParam(name="title", required=false, defaultValue="title") String title, Model model) {
	        model.addAttribute("title", title);
	        return "studenthistorys";
	    }
	}
}
