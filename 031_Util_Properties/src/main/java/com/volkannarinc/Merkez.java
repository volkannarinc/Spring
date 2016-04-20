package com.volkannarinc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context =
				new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Ayar ayar = context.getBean("ayarBean", Ayar.class);
		
		System.out.println(ayar);
		
		ayar.sonucuYaz();
		
		((AbstractApplicationContext) context).close();
	}

}
