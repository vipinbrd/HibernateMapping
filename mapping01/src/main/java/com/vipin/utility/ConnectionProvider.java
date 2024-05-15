package com.vipin.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionProvider {
	
	private static EntityManagerFactory emf;
	
	
	
	public static EntityManager getManager() {
		
		emf=Persistence.createEntityManagerFactory("employeeUnit");
		
		
		return emf.createEntityManager();
	}
	
	
	

}
