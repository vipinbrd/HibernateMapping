package com.vipin.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	@Column(name = "ename")
	private String name;
    @OneToMany
    @Cascade(CascadeType.ALL)
    @JoinTable(name="emp_adr",joinColumns = @JoinColumn(name="empid"),inverseJoinColumns = @JoinColumn(name="adrid"))
	private List<Address> adr=new ArrayList<>();

	public Employee() {

	}

	

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", adr=" + adr + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAdr() {
		return adr;
	}

	public void setAdr(List<Address> adr) {
		this.adr = adr;
	}
	

	
	

}
