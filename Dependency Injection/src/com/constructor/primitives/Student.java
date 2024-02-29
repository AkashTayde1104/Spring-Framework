package com.constructor.primitives;

public class Student {
	
	private int s_Id;
	private String s_Name;
	
	public Student(int s_Id, String s_Name) {
	
		this.s_Id = s_Id;
		this.s_Name = s_Name;
	}

	public int getS_Id() {
		return s_Id;
	}

	public String getS_Name() {
		return s_Name;
	}
	
	//or
	
	public void display()
	{
		System.out.println(s_Id);
		System.out.println(s_Name);
		
	}

	//or
	
//	@Override
//	public String toString() {
//		return "Student [s_Id=" + s_Id + ", s_Name=" + s_Name + "]";
//	}
	
	
	
	
	
	
	

}
