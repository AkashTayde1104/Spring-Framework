package com.constructor.secondary;

public class Student {
	
	private int s_Id;
	
	private String s_Name;
	
	private Address address;

	public Student(int s_Id, String s_Name, Address address) {
	
		this.s_Id = s_Id;
		this.s_Name = s_Name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [s_Id=" + s_Id + ", s_Name=" + s_Name + ", address=" + address + "]";
	}
	
	

}
