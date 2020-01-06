package com.cde.assessment.Service;

import java.util.List;

import com.cde.assessment.Model.Drink;


public interface DrinkInterface {
	
	String drink();

	//public Drink createDrinkOrder( Drink drink);

	
	public Drink getDrinkOrder(Long id);

	public List<Drink> getAllDrinkOrders();
}
