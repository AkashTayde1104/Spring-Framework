package com.tech.autowired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Spring_Autowired_Annotation.xml");
		
		Student stu=(Student)ap.getBean("s");
		System.out.println(stu.getS_Id());
		System.out.println(stu.getS_Name());
		System.out.println(stu.getAddrs().getArea_Name());
		System.out.println(stu.getAddrs().getCity_Name());
	}

}
