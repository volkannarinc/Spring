package com.volkannarinc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* SPRÝNG YAPILANDIRMA AYARLARINI TUTAN SINIF */
@Configuration
public class AppConfig {
	
	// INTERFACE'NIN YÖNETÝMÝ SPRÝNGE VERÝLÝYOR.
	//GERÝ PLANDA SPRÝNGÝN YÖNETECEÐÝ BEAN'IN DAINI SELAM VERDÝK.
	// BU METODLAR PUBLÝC OLMALI VE BÝR SINIF RETURN EDÝLMELÝ.
	@Bean(name="selam")
	public ISelam mesajYaz(){
		return new SelamImpl();
	}
}
