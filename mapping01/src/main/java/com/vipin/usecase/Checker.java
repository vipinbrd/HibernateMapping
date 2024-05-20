package com.vipin.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.vipin.entity.Address;
import com.vipin.entity.Employee;
import com.vipin.utility.ConnectionProvider;

public class Checker {

	public static void main(String[] args) {
		EntityManager em = ConnectionProvider.getManager();
//		Address adr = new Address(1, "mp", "home");
//		Address adr2 = new Address(2, "up", "office");
//		Employee emp = new Employee();
//		Employee emp2 = new Employee();
//		emp.setName("shourya");
//		emp.getAdr().add(adr2);
//		emp.getAdr().add(adr);
//		adr.getEmplist().add(emp);
//		adr.getEmplist().add(emp2);
//		adr2.getEmplist().add(emp);
//		adr2.getEmplist().add(emp2);
//		emp2.setName("vipin");
//		
//
//	
//		emp2.getAdr().add(adr);
//		emp2.getAdr().add(adr2);
//
//		em.getTransaction().begin();
//
//		em.persist(emp);
//		em.persist(emp2);
//
//		em.close();
//		em.getTransaction().commit();
		
		
	Address adr=em.find(Address.class, 2);
System.out.println(adr.getEmplist());
	}

}
