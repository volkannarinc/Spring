package com.volkannarinc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AConfig.class,BConfig.class})	//BU s�n�flar� da dahil ediyoruz bu s�n�fa
public class MerkezAppConfig {

}
