package com.cde.assessment.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DrinkServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DrinkServiceApplication.class, args);
	}
	
}
