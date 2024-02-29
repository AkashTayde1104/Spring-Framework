package com.setter.secondary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("Spring_Setter_Secondary.xml");
		Student stu=(Student)ap.getBean("s");
		
		System.out.println(stu.getS_Id());
		System.out.println(stu.getS_Name());
		System.out.println(stu.getMob_No());
		System.out.println(stu.getAddress().getArea_Name());
		System.out.println(stu.getAddress().getCity_Name());
	}

}

//--------spring.xml----------

//<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
//"http://www.springframework.org/dtd/spring-beans-2.0.dtd">
//
//<beans>
//   <bean id="a" class="com.setter.secondary.Address">
//     <property name="area_Name" value="Hinjwadi"></property>
//     <property name="city_Name" value="Pune"></property>
//   </bean>
//
//
//  <bean id="s" class="com.setter.secondary.Student" >
//  
//  <property name="s_Id" value="101"></property>
//  <property name="s_Name" value="Rahul Moin"></property>
//  <property name="mob_No" value="9665015924"></property>
//  <property name="address" ref="a"></property>
//  
//  </bean>
//
//</beans