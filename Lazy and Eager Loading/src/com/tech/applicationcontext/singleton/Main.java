package com.tech.applicationcontext.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//application context with singleton= Eager loading
public class Main {
	public static void main(String[] args) {
		
		System.out.println("Main start");
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("Spring_Ap_Singleton.xml");
		
		System.out.println("after ap");
		
		Welcome wel=(Welcome)ap.getBean("w");
		
		wel.hello();
	}

}

//---------------spring.xml----------------

//<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
//"http://www.springframework.org/dtd/spring-beans-2.0.dtd">
//
//<beans>
//
//   <bean id="w" class="com.tech.applicationcontext.singleton.Welcome" scope="singleton"></bean>
//
//</beans>