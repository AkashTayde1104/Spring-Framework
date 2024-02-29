package com.constructor.secondary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("Spring_Cons_Secondary.xml");
		
		Student stu=(Student)ap.getBean("s");
		
		System.out.println(stu);
	}

}

//--------spring.xml-------------

//<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
//"http://www.springframework.org/dtd/spring-beans-2.0.dtd">
//
//<beans>
//
//
//<bean id="a" class= "com.constructor.secondary.Address">
//     <constructor-arg value="Hinjwadi"></constructor-arg>
//     <constructor-arg value="Pune"></constructor-arg>
//</bean>
//
//	<bean id="s" class="com.constructor.secondary.Student">
//	
//	   <constructor-arg value = "101" ></constructor-arg>
//	   <constructor-arg value = "Ritesh" ></constructor-arg>
//	   <constructor-arg ref="a"></constructor-arg>
//	</bean>
//</beans>

