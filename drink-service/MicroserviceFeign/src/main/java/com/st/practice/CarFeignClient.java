package com.st.practice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-eureka-client")
public interface CarFeignClient {

	@RequestMapping("/cars")
	String cars();
}
