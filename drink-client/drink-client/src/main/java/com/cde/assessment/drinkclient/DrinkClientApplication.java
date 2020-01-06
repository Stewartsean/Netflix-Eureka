package com.cde.assessment.drinkclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableFeignClients
@Controller
public class DrinkClientApplication {

	@Autowired
	private DrinkClient drinkClient;
	
	public static void main(String[] args) {
		SpringApplication.run(DrinkClientApplication.class, args);
	}
	@RequestMapping("/get-drink")
	public String drink(Model model)
	{
		model.addAttribute("drink", drinkClient.drink());
		return "drink-view";
	}
	@RequestMapping("/get-drinks")
	public String drinks(Model model)
	{
		model.addAttribute("drinks", drinkClient.drinks());
		return "drinks-view";
	}

}
