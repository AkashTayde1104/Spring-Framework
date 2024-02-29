package com.constructor.primitives;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("Spring_Cons_Primi.xml");
		
		Student stu=(Student)ap.getBean("s");
		
//		System.out.println(stu.getS_Id());
//		System.out.println(stu.getS_Name());
		
		//or
		
		stu.display();
		
		//or 
//		System.out.println(stu);
	}

}

//---------spring.xml----------

//<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
//"http://www.springframework.org/dtd/spring-beans-2.0.dtd">
//
//<beans>
//
//	<bean id="s" class="com.constructor.primitives.Student">
//	
//	   <constructor-arg value = "101" ></constructor-arg>
//	   <constructor-arg value = "Ritesh" ></constructor-arg>
//	
//	</bean>
//</beans>

