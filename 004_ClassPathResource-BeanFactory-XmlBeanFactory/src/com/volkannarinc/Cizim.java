package com.volkannarinc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


@SuppressWarnings("deprecation")
public class Cizim {

	public static void main(String[] args) {
		// METADATA BÝLGÝLERÝ SRC KLAORU ÝÇÝNDEYSE KULLANILIR
		ClassPathResource classPathResource = new ClassPathResource("spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		
		Ucgen ucgen = (Ucgen) beanFactory.getBean("ucgen");
		ucgen.ciz();
	}

}
