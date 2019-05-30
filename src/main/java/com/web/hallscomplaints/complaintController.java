package com.web.hallscomplaints;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ComplaintController {
	@RequestMapping("complaintview")
		
		public String complaintview() {
			System.out.println("Hey");
			return "complaintview.jsp";
		}
	public void dataInsert() {
	
		
        Complaint com = new Complaint();
	    
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
	    LocalDate date = LocalDate.now();
	    com.setDate_of_report(date.format(formatter)); 
		
	    com.setComplaint_report("heyyyyyy there");
	    com.setTitle("Report");
	    com.setReg_no(53363);
	    com.setHostel_name("shsjk");
	    com.setStatus("well");
	    com.setAdmin_report("he");
	    com.setCustodian_report("re");
	    com.setComplaint_no("4537");
	    

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(com);
		em.getTransaction().commit();

		System.out.println(com);
		 
	}
}
