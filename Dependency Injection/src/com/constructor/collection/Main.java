package com.constructor.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("Spring_Cons_Collection.xml");

		Student stu = (Student) ap.getBean("s");

		System.out.println("\n----------List data---------\n");

		List myList = stu.getMyList();
		System.out.println(myList);

		Iterator itr = myList.iterator();
		while (itr.hasNext()) 
		{
			Object list = itr.next();
			System.out.println(list);
		}

		
		System.out.println("\n--------Set data---------\n");

		Set mySet = stu.getMySet();
		System.out.println(mySet);

		for (Object set : mySet) 
		{
			System.out.println(set);
		}
		

		System.out.println("\n-------Map data-------------\n");

		Map myMap = stu.getMyMap();
		System.out.println(myMap);

		Set entrySet = myMap.entrySet();
		for (Object map : entrySet) 
		{
			System.out.println(map);
		}

		System.out.println("\nUsing iterator");
		Set key = myMap.keySet();

		Iterator itr1 = key.iterator();
		while (itr1.hasNext())
		{
			Object k = itr1.next();
			Object v = myMap.get(k);
			System.out.println(k);
			System.out.println(v);
		}

	}

}
