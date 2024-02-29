package com.tech.singletonscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	
	public static void main(String[] args) {
	
		ApplicationContext a=new ClassPathXmlApplicationContext("Spring_Singleton_Scope.xml");
		
		Welcome wel = (Welcome)a.getBean("w");
		System.out.println("first call........."+wel);
		
		Welcome wel1 = (Welcome)a.getBean("w");
		System.out.println("second call........."+wel1);
		
	}

}



//-------------Spring.xml-----------------

//<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
//"http://www.springframework.org/dtd/spring-beans-2.0.dtd">
//<beans>
//
//<bean id="w" class="com.tech.singletonscope.Welcome" scope="singleton" ></bean>
//
//
//<!-- for 2 bean create 2 object -->
//<!-- for every multiple request of single bean create only one object in singleton -->
//
//</beans>


