package com.cde.assessment.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cde.assessment.Model.Drink;

@Repository
public interface DrinkRepository extends CrudRepository<Drink, Long>{
	public List<Drink> findAll(); 
	public Drink findDrinkById(Long id);}
