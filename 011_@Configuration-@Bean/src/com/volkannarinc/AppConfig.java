package com.volkannarinc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* SPR�NG YAPILANDIRMA AYARLARINI TUTAN SINIF */
@Configuration
public class AppConfig {
	
	// INTERFACE'NIN Y�NET�M� SPR�NGE VER�L�YOR.
	//GER� PLANDA SPR�NG�N Y�NETECE�� BEAN'IN DAINI SELAM VERD�K.
	// BU METODLAR PUBL�C OLMALI VE B�R SINIF RETURN ED�LMEL�.
	@Bean(name="selam")
	public ISelam mesajYaz(){
		return new SelamImpl();
	}
}
