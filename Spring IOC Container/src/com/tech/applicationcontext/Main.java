package com.tech.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	
	public static void main(String[] args) {
		
//		Resource r=new ClassPathResource("Spring.xml");
//		BeanFactory b=new XmlBeanFactory(r);
		
		ApplicationContext a=new ClassPathXmlApplicationContext("Spring_Ap.xml");
	    Welcome wel = (Welcome)a.getBean("w");
		wel.hello();
	}

}


//-------------Spring.xml-------------
//
//<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
//"http://www.springframework.org/dtd/spring-beans-2.0.dtd">
//<beans>
//
//<bean id="w" class="com.tech.applicationcontext.Welcome"></bean>
//
//
//</beans>
