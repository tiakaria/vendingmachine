package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.SaleList;
import com.example.repositories.SaleListRepository;

@Service
public class SaleListService {
	@Autowired
	private SaleListRepository sr;
	
	public SaleList addSale(SaleList sl){
		 return sr.save(sl);
	}
}
