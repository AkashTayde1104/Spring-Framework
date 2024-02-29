package com.tech.partially.injection.constructor;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	
	public static void main(String[] args) {
		
//	Resource r=new ClassPathResource("Spring.xml");
//	
//	BeanFactory b=new XmlBeanFactory(r);
	
	
	ApplicationContext ap=new ClassPathXmlApplicationContext("Spring_Partial_Inject_Constructor.xml");
		
   
	Student stu = (Student)ap.getBean("s");
	System.out.println(stu.getS_Id());
	System.out.println(stu.getS_Name());

	
//	o/p= org.springframework.beans.factory.UnsatisfiedDependencyException
}
}
