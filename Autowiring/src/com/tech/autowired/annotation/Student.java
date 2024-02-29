package com.tech.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;


public class Student {

	private int s_Id;
	private String s_Name;
	
	@Autowired
	private Address addrs;
	

	public int getS_Id() {
		return s_Id;
	}

	public void setS_Id(int s_Id) {
		this.s_Id = s_Id;
	}

	public String getS_Name() {
		return s_Name;
	}

	public void setS_Name(String s_Name) {
		this.s_Name = s_Name;
	}

	public Address getAddrs() {
		return addrs;
	}

	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}
	
	
}
