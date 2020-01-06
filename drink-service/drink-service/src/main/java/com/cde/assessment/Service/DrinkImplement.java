package com.cde.assessment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.cde.assessment.Model.Drink;
import com.cde.assessment.Repository.DrinkRepository;
import com.netflix.discovery.EurekaClient;

@Service
public class DrinkImplement implements DrinkInterface{


	@Autowired
	@Lazy
	private EurekaClient eurekaClient;

	@Autowired
	DrinkRepository drinkRepository;

	@Value("${spring.application.name}")
	private String appName;

	@Override
	public String drink() {
		return String.format("Hello from '%s'", eurekaClient.getApplication(appName).getName());
	}

	@Override
	public Drink getDrinkOrder(Long id) {
		return drinkRepository.findDrinkById(id);
	}

	@Override
	public List<Drink> getAllDrinkOrders() {
		return drinkRepository.findAll();
	}

}
