package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.entities.Drink;


@CrossOrigin()
@Repository
public interface DrinkRepository extends JpaRepository<Drink, Integer>{

}
