package com.cde.assessment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cde.assessment.Service.DrinkImplement;

@RestController
public class DrinkController 
{
	@Autowired
	DrinkImplement drinkImplement;
	
	@GetMapping("/drink")
	public String drink()
	{
		return drinkImplement.drink();
	}
}
