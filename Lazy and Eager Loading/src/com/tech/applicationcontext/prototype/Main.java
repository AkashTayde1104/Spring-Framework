package com.tech.applicationcontext.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//application context with prototype = Lazy loading
public class Main {
	
	public static void main(String[] args) {
		System.out.println("main start");
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("Spring_Ap_Prototype.xml");
		
		System.out.println("After ap");
		
		Welcome wel=(Welcome)ap.getBean("w");
		
		wel.hello();
	}

}

//--------------spring.xml---------------

//<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
//"http://www.springframework.org/dtd/spring-beans-2.0.dtd">
//
//<beans>
//
//   <bean id="w" class="com.tech.applicationcontext.prototype.Welcome" scope="prototype"></bean>
//
//</beans>
