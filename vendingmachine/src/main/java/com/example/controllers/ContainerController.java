package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Container;
import com.example.exception.ResourceNotFoundException;
import com.example.services.ContainerService;

@CrossOrigin()
@RestController
@RequestMapping()
public class ContainerController {
	@Autowired
	private ContainerService cs;
	
	@GetMapping("/containers/{id}")
    public ResponseEntity <Container> getContainerById(@PathVariable("id") int id)
    throws ResourceNotFoundException {
        Container ctn = cs.getContainerById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Container not found for this id :: " + id));
        return ResponseEntity.created(null).body(ctn);
    }
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping("/containers/update")
	public ResponseEntity<Container> updateContainer(@RequestBody Container ctn) 
	throws ResourceNotFoundException
	{
		return ResponseEntity.created(null).body(cs.updateContainer(ctn));
	}
}
