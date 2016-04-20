package com.volkannarinc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("beans.xml");
		
		Selam nesne1 = (Selam) applicationContext.getBean("selam");
		System.out.println(nesne1.getMesaj1() + "\n" +nesne1.getMesaj2() + "\n");
		
		Yazar nesne2 = (Yazar) applicationContext.getBean("yazar");		
		System.out.println(nesne2.getMesaj1() +"\n"+
				nesne2.getMesaj2() +"\n"+
				nesne2.getMesaj3() +"\n");
	}
}
	