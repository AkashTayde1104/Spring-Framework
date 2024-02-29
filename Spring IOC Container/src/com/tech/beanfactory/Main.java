package com.tech.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	
	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("Spring_BF.xml");
		BeanFactory b=new XmlBeanFactory(r);
		Welcome wel=(Welcome)b.getBean("w");
		wel.hello();
	}

}


//------------------Spring.xml-----------------------
//
//<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
//"http://www.springframework.org/dtd/spring-beans-2.0.dtd">
//<beans>
//
//<bean id="w" class="com.tech.beanfactory.Welcome"></bean>
//
//
//</beans>
