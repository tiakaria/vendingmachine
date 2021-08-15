package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.entities.Container;
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
	public ResponseEntity<SaleList> addSale(@RequestBody SaleList p){
		//return new ResponseEntity<>(ps.addProduct(p), HttpStatus.OK);
		return ResponseEntity.created(null).body(sls.addSale(p));
	}
	
	@GetMapping("/saleLists/{id}")
    public ResponseEntity <SaleList> getSaleById(@PathVariable(value = "id") int id)
    throws ResourceNotFoundException {
        SaleList sl = sls.getSaleById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Sale not found for this id :: " + id));
        return ResponseEntity.created(null).body(sl);
    }
}
