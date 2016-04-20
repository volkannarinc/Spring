package com.volkannarinc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AConfig.class,BConfig.class})	//BU sýnýflarý da dahil ediyoruz bu sýnýfa
public class MerkezAppConfig {

}
