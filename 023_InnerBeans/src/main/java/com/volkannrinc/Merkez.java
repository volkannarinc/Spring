package com.volkannrinc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Musteri musteri = context.getBean("beanMusteri", Musteri.class);
		musteri.hesabiOde();
	}

}
