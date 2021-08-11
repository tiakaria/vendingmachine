package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.entities.SaleList;
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
}
