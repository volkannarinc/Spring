package com.volkannarinc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
				new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Sehir sehir = context.getBean("beanSehir", Sehir.class);
		
		System.out.println(sehir);
		
		((AbstractApplicationContext) context).close();
	}

}
