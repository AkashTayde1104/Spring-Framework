package com.tech.beanfactory.prototype;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

//beanfactory with prototype = Lazy Loading
public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		BeanFactory b=new XmlBeanFactory(new ClassPathResource("Spring_BF_Prototype.xml"));
		
		System.out.println("After beanfactory");
		
		Welcome wel=(Welcome)b.getBean("w");//constructor called when getbean called
		
		wel.hello();
	}

}

//----------spring.xml------------

//<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
//"http://www.springframework.org/dtd/spring-beans-2.0.dtd">
//
//<beans>
//
//   <bean id="w" class="com.tech.beanfactory.prototype.Welcome" scope="prototype"></bean>
//
//</beans>
