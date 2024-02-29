package com.tech.beanfactory.singletonscope;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;

//beanfactory with singletone = Lazy Loading
public class Main {
	public static void main(String[] args) {
	   System.out.println("Main Start");
	   
	  BeanFactory b=new XmlBeanFactory(new ClassPathResource("Spring_BF_Singleton.xml"));
	  
	  System.out.println("After BeanFactory");
	  
	  Welcome wel=(Welcome)b.getBean("w");//constructor called when bean called
	  wel.hello();
	  
	}

}


//-------------spring.xml---------

//<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
//"http://www.springframework.org/dtd/spring-beans-2.0.dtd">
//
//<beans>
//
//   <bean id="w" class="com.tech.beanfactory.singletonscope.Welcome" scope="singleton"></bean>
//
//</beans>
