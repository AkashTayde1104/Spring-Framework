package com.setter.primitivearray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Spring_setter_PrimitiveArray.xml");
		
		Student stu=(Student)ap.getBean("s");
		
		System.out.println(stu.getS_Id());
		System.out.println(stu.getS_Name());
		String[] mob_no = stu.getMob_No();
		
		for(int i=0;i<mob_no.length;i++)
		{
			System.out.println(mob_no[i]);
		}
		
		//or
//		for(String mob:mob_no)
//			{
//				System.out.println(mob);
//			}
			
	}

}

//------------spring.xml----------------

//<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
//"http://www.springframework.org/dtd/spring-beans-2.0.dtd">
//
//<beans>
//	<bean id="s" class="com.setter.primitivearray.Student">
//
//		<property name="s_Id" value="101"></property>
//		<property name="s_Name" value="Rahul Moin"></property>
//		<property name="mob_No">
//
//			<list>
//				<value>9881150348</value>
//				<value>1366774654</value>
//				<value>75768789765</value>
//			</list>
//			
//		</property>
//
//	</bean>
//</beans>

