package com.setter.secondaryarray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Spring_Setter_SecondaryArray.xml");
		
		Student stu=(Student)ap.getBean("s");
		System.out.println(stu.getS_Id());
		System.out.println(stu.getS_Name());
	 
		Mobile[] mob_No = stu.getMob_No();
	    
//	    for(Mobile mob:mob_No)
//	    {
//	    	System.out.println(mob.getMob_No());
//	    }
		
		for(int i=0;i<mob_No.length;i++)
		{
			System.out.println(mob_No[i].getMob_No());
		}
	}

}

//--------------spring.xml----------

//<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
//"http://www.springframework.org/dtd/spring-beans-2.0.dtd">
//
//<beans>
//
//  <bean id="m1" class="com.setter.secondaryarray.Mobile">
//       <property name="mob_No" value="9881150348"></property>
//  </bean>
//  
//  
//  <bean id="m2" class="com.setter.secondaryarray.Mobile">
//       <property name="mob_No" value="47534748"></property>
//  </bean>
//  
//  <bean id="m3" class="com.setter.secondaryarray.Mobile">
//      <property name="mob_No" value="76456363545"></property>
//  </bean>
//
//
//
//	<bean id="s" class="com.setter.secondaryarray.Student">
//
//		<property name="s_Id" value="101"></property>
//		<property name="s_Name" value="Rahul Moin"></property>
//		<property name="mob_No">
//		<list>
//		   <ref bean="m1"></ref>
//		   <ref bean="m2"></ref>
//		   <ref bean="m3"></ref>
//		</list>
//
//		
//		</property>
//
//	</bean>
//</beans>
