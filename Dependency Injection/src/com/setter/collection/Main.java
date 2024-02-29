package com.setter.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("Spring_Setter_Collection.xml");
		Student stu=(Student)ap.getBean("s");
		
		List<String> myList = stu.getMyList();
		System.out.println(myList);
		
		
		//1.for each
		for(String list:myList)
		{
			System.out.println(list);
		}
		
//		//2. iterator
//		Iterator<String> itr = myList.iterator();
//		while(itr.hasNext())
//		{
//			String list1 = itr.next();
//			System.out.println(list1);
//		}
//		
//	
		System.out.println("\n------Set data------\n");
		
		Set<String> mySet=stu.getMySet();
		System.out.println(mySet);
		
		
		//1.for each
		for(String set:mySet)
		{
			System.out.println(set);
		}
		
//		//2.iterator
//		Iterator<String> itr1 = mySet.iterator();
//		while(itr1.hasNext())
//		{
//			String set1 = itr1.next();
//			System.out.println(set1);
//		}
		
		System.out.println("--------Map data---------");
		
		Map<String,String> Map=stu.getMyMap();
		System.out.println(Map);
		

		//1.Using for each with entryset
	     for(Entry<String,String> map1:Map.entrySet())
	     {
	    	 System.out.println(map1);
	    	 
	     }
		
		//2.using for each get key and value
//			Set<String> key =  Map.keySet();
//		for(String k:key)
//		{
//			System.out.println(k);
//			String v = Map.get(k);
//		    System.out.println(v);
//			
//		}
		
		//3.using iterator get key get value
//		Set<String> key =  Map.keySet();
//		Iterator<String> itr2 = key.iterator();
//		while(itr2.hasNext())
//		{
//			String k = itr2.next();
//			System.out.println(k);
//			
//			String v = Map.get(k);
//			System.out.println(v);
//		}
		
	}

}


//-----spring.xml----------------

//<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
//"http://www.springframework.org/dtd/spring-beans-2.0.dtd">
//
//<beans>
//
//	<bean id="s" class="com.setter.collection.Student">
//
//		<property name="myList"> 
//		    <list>
//		      <value>Java</value>
//		      <value>Python</value>
//		   </list>
//		</property>
//		
//		
//		<property name="mySet">
//		   <set>
//		     <value>Angular</value>
//		     <value>React</value>
//		   </set>
//		</property>
//		
//		<property name="myMap">
//		  <map>
//		     <entry key="101" value="web-services"></entry>
//		     <entry key="102" value="microservices"></entry>
//		  </map>
//		</property>
//	
//	</bean>
//</beans>
//
