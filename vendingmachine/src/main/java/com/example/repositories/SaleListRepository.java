package com.example.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entities.*;

@CrossOrigin()
@Repository
public interface SaleListRepository extends JpaRepository<SaleList, Integer>{
	List<SaleList> findByDrinkId(@RequestParam("id") int id);
}
