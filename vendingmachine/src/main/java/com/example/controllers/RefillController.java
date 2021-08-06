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
@RequestMapping("/api/refill")
public class RefillController {
	@Autowired
	private RefillService rs;
	
//	@PostMapping()
//	public ResponseEntity<?> addRefill(@RequestBody Refill rf){
//		Refill x = rs.addRefill(rf);
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(x.getRefillId())
//                .toUri();
//		return ResponseEntity.created(location).build();
//	};
	
}
