package com.web.hallscomplaints;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.web.hallscomplaints.HibernateUtil;
@SpringBootApplication
public class HallscomplaintsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HallscomplaintsystemApplication.class, args);
		
		Complaint com = new Complaint();
	        
	    com.setComplaint_report("heyyyyyy there");
	    com.setTitle("Report");
	    com.setReg_no(53363);
	    com.setHostelBlock("sfgs");
	    com.setHostelHall("shsjk");

	    Session session = HibernateUtil.getSessionFactory().openSession();
		
        Transaction tx = session.beginTransaction();
        tx.commit();
       
        session.save(com);
        session.close();
        System.out.println("Maven + Hibernate + MySQL");
		System.out.println("heeey");
	}
}
