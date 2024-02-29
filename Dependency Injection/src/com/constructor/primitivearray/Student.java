package com.constructor.primitivearray;

import java.util.Arrays;

public class Student {
	
	private int s_Id;
	private String s_Name;
	private long mob_No[];
	
	
	public Student(int s_Id, String s_Name, long[] mob_No) {
		
		this.s_Id = s_Id;
		this.s_Name = s_Name;
		this.mob_No = mob_No;
	}


	@Override
	public String toString() {
		return "Student [s_Id=" + s_Id + ", s_Name=" + s_Name + ", mob_No=" + Arrays.toString(mob_No) + "]";
	}
	
	

}
