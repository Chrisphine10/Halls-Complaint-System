package com.web.hallscomplaints;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	        
		Configuration con = new Configuration().configure().addAnnotatedClass(Complaint.class);
		
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
        Transaction tx = session.beginTransaction();
        
        session.save(com);
        
        System.out.println("Maven + Hibernate + MySQL");
        tx.commit();
		System.out.println("heeey");
	}
}
