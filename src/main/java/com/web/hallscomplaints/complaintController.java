package com.web.hallscomplaints;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ComplaintController {
		
		@RequestMapping(value = "complaintview")
		public String complaintview(HttpServletRequest request, HttpServletResponse respnose) {
		System.out.println("The start");

		Complaint com = new Complaint();
		String block = null;
		String hall = null;
		int reg = 0;
		
		UserLogIn ul = new UserLogIn();
		int reg_no = ul.getReg_no();
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
			EntityManager em = emf.createEntityManager();
			
			Student_details stu_detail = em.find(Student_details.class, reg_no);
			reg = stu_detail.getReg_no();
			block = stu_detail.getHostel_block();
			hall = stu_detail.getHostel_hall();
			
			
			System.out.println(stu_detail);
		    }
		    catch (Exception E) {
	            System.out.println(E);
		    }
		
		String comp_title = request.getParameter("title");
		String comp_body = request.getParameter("body");
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
	    LocalDate date = LocalDate.now();
	    com.setDate_of_report(date.format(formatter)); 
	    com.setComplaint_report(comp_body);
	    com.setTitle(comp_title);
	    com.setReg_no(reg);
	    com.setHostel_hall(hall);
	    com.setHostel_block(block);
	    com.setStatus("well");
	    com.setAdmin_report("he");
	    com.setCustodian_report("re");
	   
	    try {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		System.out.println("entity manager configured");
		em.getTransaction().begin();
		em.persist(com);
		System.out.println("persisted");
		em.getTransaction().commit();

		System.out.println(com);
	    }
	    catch (Exception E) {
            System.out.println(E);
	    }
	    
		return "complaintview.jsp";
	}
}
