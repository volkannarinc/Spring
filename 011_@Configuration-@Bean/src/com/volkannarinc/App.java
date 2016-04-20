package com.volkannarinc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		ISelam obj = (ISelam) applicationContext.getBean("selam");
		obj.mesajYaz("Spring Öðrenmek bir harika dostum !");
	}

}
