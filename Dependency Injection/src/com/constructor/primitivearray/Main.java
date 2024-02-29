package com.constructor.primitivearray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("Spring_Cons_PrimitiveArray.xml");
		
		Student stu=(Student)ap.getBean("s");
		
		System.out.println(stu);
		
		
	}

}
