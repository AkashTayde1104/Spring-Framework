package com.tech.constructor;

public class Student {
	private int s_Id;
	private String s_Name;
	private Address addres;

	public Student(int s_Id, String s_Name, Address addres) {

		this.s_Id = s_Id;
		this.s_Name = s_Name;
		this.addres = addres;
	}

	@Override
	public String toString() {
		return "Student [s_Id=" + s_Id + ", s_Name=" + s_Name + ", addres=" + addres + "]";
	}

}
