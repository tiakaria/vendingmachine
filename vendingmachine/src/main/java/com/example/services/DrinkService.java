package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Drink;
import com.example.exception.ResourceNotFoundException;
import com.example.repositories.DrinkRepository;

@Service
public class DrinkService {
	@Autowired
	private DrinkRepository dr;
	
	public List<Drink> getAllDrinks(){
		return dr.findAll();
	}
	
	public Optional<Drink> getDrinkById(int id)
	throws ResourceNotFoundException
	{
		return dr.findById(id);
	}
	
}
