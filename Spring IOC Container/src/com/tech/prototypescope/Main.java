package com.tech.prototypescope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext a=new ClassPathXmlApplicationContext("Spring_Prototype_Scope.xml");
		
		Welcome wel = (Welcome)a.getBean("w");
		System.out.println(wel);
		
		Welcome wel1=(Welcome)a.getBean("w");
		System.out.println(wel1);
	}

}


//----------Spring.xml-----------------------

//<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
//"http://www.springframework.org/dtd/spring-beans-2.0.dtd">
//<beans>
//
//<bean id="w" class="com.tech.prototypescope.Welcome" scope="prototype" ></bean>
//
//
//<!-- for 1 bean create diff object on each request -->
//<!-- for every request on prototype scope create different object object  -->
//
//</beans>
