package com.tech.bytype;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("Spring_byType.xml");
		
		Student stu=(Student)ap.getBean("s");
		
		System.out.println(stu.getS_Id());
		System.out.println(stu.getS_Name());
		System.out.println(stu.getAddres().getArea_Name());
		System.out.println(stu.getAddres().getCity_Name());
	}

}
