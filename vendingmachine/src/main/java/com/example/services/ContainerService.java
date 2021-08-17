package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Container;
import com.example.exception.ResourceNotFoundException;
import com.example.repositories.ContainerRepository;

@Service
public class ContainerService {
	@Autowired
	private ContainerRepository cr;
	
	public Optional<Container> getContainerById(int id)
	throws ResourceNotFoundException
	{
		return cr.findById(id);
	}
	
	public Container updateContainer(Container ctn) 
	throws ResourceNotFoundException
	{
		Container tmpCtn = cr.findById(ctn.getId())
				.orElseThrow(() -> new ResourceNotFoundException("Container not found for this id :: "+ctn.getId()));
		final Container updatedCtn = this.cr.save(ctn);
		return updatedCtn;
	}
	
}
