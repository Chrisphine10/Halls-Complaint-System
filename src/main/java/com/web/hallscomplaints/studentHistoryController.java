package com.web.hallscomplaints;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class StudentHistoryController {
	@RequestMapping("studenthistory")
	
	public String studenthistory(Model model) {
		System.out.println("Hello. This is history");
		 try {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
				EntityManager em = emf.createEntityManager();
				
				UserLogIn ul = new UserLogIn();
				int reg = ul.getReg_no();
				Complaint com = em.find(Complaint.class, reg);
			
				model.addAttribute("complaint",com);
				System.out.println(com);
				em.close();
				
			    }
			    catch (Exception E) {
		            System.out.println(E);
			    }
		return "studenthistory.jsp";
	
	}
}
