package com.cde.assessment.drinkclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-eureka-client")
public interface DrinkClient  {
	
	@RequestMapping("/drink")
	String drink();
	
	@GetMapping("/drinks")
	String drinks();
	
}
