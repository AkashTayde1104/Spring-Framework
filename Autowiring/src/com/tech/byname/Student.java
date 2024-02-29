package com.tech.byname;


public class Student {
	private int s_Id;
	private String s_Name;
	private Address addres;
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
	public Address getAddres() {
		return addres;
	}
	public void setAddres(Address addres) {
		this.addres = addres;
	}
	
	@Override
	public String toString() {
		return "Student [s_Id=" + s_Id + ", s_Name=" + s_Name + ", addres=" + addres + "]";
	}
	
	

}
