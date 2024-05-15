package com.vipin.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.vipin.entity.Address;
import com.vipin.entity.Employee;
import com.vipin.utility.ConnectionProvider;

public class Checker {

	public static void main(String[] args) {
		EntityManager em=ConnectionProvider.getManager();
//		Address adr=new Address(1,"mp","home");
//		Address adr2=new Address(2,"up","office");
//		Employee emp=new Employee();
//		emp.setName("shourya");
//        emp.getAdr().add(adr2);
//        emp.getAdr().add(adr);
//		em.getTransaction().begin();
//		 
//		em.persist(emp);
//		
//		em.close();
//		em.getTransaction().commit();
		String jpql="select adr from Employee";
		
		Query q= em.createQuery(jpql);
		
	   List<Address>obj= q.getResultList();
	  System.out.println(obj);
		
	


	}

}
