package com.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate getmytemplate() {
		return new RestTemplate();
	}
	

}
