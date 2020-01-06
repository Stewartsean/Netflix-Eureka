package com.st.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableFeignClients
@Controller
public class MicroserviceFeignApplication {
	
	@Autowired
	private CarFeignClient carClient;

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceFeignApplication.class, args);
	}
	//URL to navigate: "localhost/8080/get-cars"
	@GetMapping("/get-cars")
	public String cars(Model model)
	{
		model.addAttribute("cars", carClient.cars());
		return "cars-view";
	}
}
