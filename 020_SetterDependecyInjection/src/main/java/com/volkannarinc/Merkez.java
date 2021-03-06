package com.volkannarinc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		B b = (B) context.getBean("beanB");
		b.sonucuGöster();
		
		System.out.println(b.getMesaj() + " " + b.getSayi());
		
		System.out.println(b.getaNesnesi());
	}

}
