package com.volkannarinc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


@SuppressWarnings("deprecation")
public class Cizim {

	public static void main(String[] args) {
		// Birden fazlaSpring yapýlarndýrma dosyasýyla çalýþmak için
		//ApplicationContext context 
		//= new ClassPathXmlApplicationContext(new String[]{"spring.xml",
		//													"spring2.xml",
		//													"spring3.xml"});

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
		BeanFactory beanFactory = context;
		
		Ucgen ucgen = (Ucgen) beanFactory.getBean("ucgen");
		ucgen.ciz();
	}

}
