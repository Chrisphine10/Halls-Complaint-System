package com.web.hallscomplaints;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
        	Configuration con = new Configuration().configure().addAnnotatedClass(Complaint.class);
        	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        	SessionFactory sessionFactory = con.buildSessionFactory(serviceRegistry);
        	
            return sessionFactory;
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static void shutdown() {
    	// Close caches and connection pools
    	getSessionFactory().close();
    }
    public static void connection() {
	    
	    Session session = HibernateUtil.getSessionFactory().openSession();
		
	    Transaction tx = session.beginTransaction();
	    tx.commit();
	   
	    session.save(null);
	    session.close();
	    System.out.println("Maven + Hibernate + MySQL");
		System.out.println("heeey");
    }

}