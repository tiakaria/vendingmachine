package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Refill;
import com.example.repositories.RefillRepository;

@Service
public class RefillService {
	@Autowired
	private RefillRepository rr;
	
	public Refill addRefill(Refill rf){
		return rr.save(rf);
	}
}
