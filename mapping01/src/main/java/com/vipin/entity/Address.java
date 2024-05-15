package com.vipin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	
	private int aid;
	private String state;
	private String country;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int aid, String state, String country) {
		super();
		this.aid = aid;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", state=" + state + ", country=" + country + "]";
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
