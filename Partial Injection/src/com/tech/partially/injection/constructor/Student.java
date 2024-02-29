package com.tech.partially.injection.constructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

//	@Override
//	public String toString() {
//		return "Student [s_Id=" + s_Id + ", s_Name=" + s_Name + ", addrs=" + addrs + "]";
//	}

}
