package com.web.hallscomplaints;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HallsOfficerHomeController {
@RequestMapping("hallsofficerhome")
	
	public String hallsofficerhome() {
		System.out.println("Hey");
		return "hallsofficerhome.jsp";
	}
	
	public class GreetingController {

	    @GetMapping("/greeting")
	    public String hallsofficerhome(@RequestParam(name="title", required=false, defaultValue="title") String title, Model model) {
	        model.addAttribute("title", title);
	        return "hallsofficerhome";
	    }
	}
}
