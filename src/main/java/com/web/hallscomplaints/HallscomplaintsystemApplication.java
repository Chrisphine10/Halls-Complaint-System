package com.web.hallscomplaints;

import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.persistence.HibernateUtil;

@SpringBootApplication
public class HallscomplaintsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HallscomplaintsystemApplication.class, args);
		
		System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Complaint com = new Complaint();
        
        com.setComplaint_report("heyyyyyy there");
        com.setTitle("Report");
        com.setReg_no("53363");
        com.setHostelBlock("sfgs");
        com.setHostelHall("shsjk");
        com.setDate("12/12/1222");
        
        session.save(com);
        session.getTransaction().commit();
		System.out.println("heeey");
	}
}
