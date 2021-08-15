package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entities.SaleList;
import com.example.exception.ResourceNotFoundException;
import com.example.repositories.SaleListRepository;

@Service
public class SaleListService {
	
	@Autowired
	private SaleListRepository sr;
	
	public Optional<SaleList> getSaleById(int id)
			throws ResourceNotFoundException
	{
				return sr.findById(id);
			}
	
	public SaleList addSale(SaleList sl){	
		return sr.save(sl);
	}
}
