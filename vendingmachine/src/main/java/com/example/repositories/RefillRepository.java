package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.entities.Refill;

@CrossOrigin()
@Repository
public interface RefillRepository extends JpaRepository<Refill, Integer> {
	
}
