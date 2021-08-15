package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.entities.Refill;

@CrossOrigin()
@Repository
public interface RefillRepository extends JpaRepository<Refill, Integer> {
	@Query("SELECT r from Refill r where DATE_FORMAT(r.date,'%Y-%M-%d') = DATE_FORMAT(current_date,'%Y-%M-%d')")
	List<Refill> findByToday();
	
	@Query("SELECT r from Refill r")
	List<Refill> findAll();
}
