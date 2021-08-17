package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.entities.Container;
import com.example.entities.Refill;
import com.example.entities.SaleList;
import com.example.exception.ResourceNotFoundException;
import com.example.services.SaleListService;


@CrossOrigin()
@RestController
@RequestMapping()
public class SaleListController {
	@Autowired
	private SaleListService sls;
	
	@PostMapping("/saleLists/add")
	public ResponseEntity<SaleList> addSale(@RequestBody SaleList p) 
			throws ResourceNotFoundException{
		return ResponseEntity.created(null).body(sls.addSale(p));
	}
	
	@GetMapping("/saleLists/{id}")
    public ResponseEntity <SaleList> getSaleById(@PathVariable(value = "id") int id)
    throws ResourceNotFoundException {
        SaleList sl = sls.getSaleById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Sale not found for this id :: " + id));
        return ResponseEntity.created(null).body(sl);
    }
	
	@GetMapping("/saleLists")
	public ResponseEntity<List<SaleList>> findAll(){
		return ResponseEntity.created(null).body(sls.findAll());
	};
	
	@GetMapping("/saleLists/search/today/{drinkId}")
	public ResponseEntity<List<SaleList>> findToday(@PathVariable("drinkId") int drinkId){
		return ResponseEntity.created(null).body(sls.findByToday(drinkId));
	};
	
	@GetMapping("/saleLists/search/{drinkId}")
	public ResponseEntity<List<SaleList>> findByDrinkId(@PathVariable("drinkId") int drinkId){
		return ResponseEntity.created(null).body(sls.findByDrinkId(drinkId));
	};
}
