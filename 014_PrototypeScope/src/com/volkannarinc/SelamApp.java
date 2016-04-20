package com.volkannarinc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("beans.xml");
		
		Selam nesne1 = (Selam) applicationContext.getBean("selam");
		
		nesne1.setMesaj("her nesne olu�turu�ldu�unda Prototypr Bean oldu�undan ayr� bean d�ner.");
		nesne1.goster();	
		
		Selam nesne2 = (Selam) applicationContext.getBean("selam");
		nesne2.getMesaj();
		nesne2.goster();
		
	}
}
	