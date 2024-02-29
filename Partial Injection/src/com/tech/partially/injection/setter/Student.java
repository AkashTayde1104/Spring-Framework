package com.tech.partially.injection.setter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private int s_Id;
	private String s_Name;
	private String s_Address;

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
	public String getS_Address() {
		return s_Address;
	}
	public void setS_Address(String s_Address) {
		this.s_Address = s_Address;
	}


//	@Override
//	public String toString() {
//		return "Student [s_Id=" + s_Id + ", s_Name=" + s_Name + ", addrs=" + addrs + "]";
//	}



	
}
