package com.example.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.entities.Refill;
import com.example.services.RefillService;

@CrossOrigin()
@RestController
@RequestMapping()
public class RefillController {
	@Autowired
	private RefillService rs;
	
	@PostMapping("/refills/add")
	public ResponseEntity<Refill> addRefill(@RequestBody Refill rf){
		return ResponseEntity.created(null).body(rs.addRefill(rf));
	};
	
}
