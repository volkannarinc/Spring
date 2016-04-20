package com.volkannarinc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Selam selam = (Selam) applicationContext.getBean("selam");
		selam.goster();		
	}
}
