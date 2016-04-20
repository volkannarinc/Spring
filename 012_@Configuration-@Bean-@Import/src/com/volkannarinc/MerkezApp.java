package com.volkannarinc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.volkannarinc.config.MerkezAppConfig;

public class MerkezApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(MerkezAppConfig.class);
		
		A a = (A) context.getBean("beana");
		B b = (B) context.getBean("beanb");
		
		a.yaz("Bu mesaj A sýnýfýndan geldi!");
		b.yaz("BU mesaj B sýnýfýndan geldi!");
	}

}
