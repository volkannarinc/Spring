package com.volkannarinc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("beans.xml");
		
		Selam nesne1 = (Selam) applicationContext.getBean("selam");
		nesne1.goster();	
		
		//BEAN'IN SONLANDIRILDIKTAN SONRA ÇALIÞMASI GEREKEN BU KOD; 
		//EN SON TANIMLANMALI
		((AbstractApplicationContext) applicationContext).registerShutdownHook();
		
	}
}
	