package com.web.hallscomplaints;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HallscomplaintsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HallscomplaintsystemApplication.class, args);
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Complaint com = new Complaint();
		com.setReg_no("67");
		com.setTitle("jii");
		com.setComplaint_report("89");
		com.setHostelHall("678");
		com.setHostelBlock("yyyu");
		session.save(com);
		tx.commit();
		System.out.println("heeey");
	}
}
