package com.volkannarinc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.volkannarinc.A;

@Configuration
public class AConfig {
	
	@Bean(name="beana")
	public A yaz(){
		return new A();
	}
}
