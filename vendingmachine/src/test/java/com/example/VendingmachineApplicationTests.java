package com.example;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.entities.Container;
import com.example.entities.Drink;
import com.example.entities.Refill;
import com.example.entities.SaleList;
import com.example.exception.ResourceNotFoundException;
import com.example.repositories.ContainerRepository;
import com.example.repositories.RefillRepository;
import com.example.repositories.SaleListRepository;
import com.example.services.ContainerService;
import com.example.services.RefillService;
import com.example.services.SaleListService;

@RunWith(SpringRunner.class)
@SpringBootTest
class VendingmachineApplicationTests {
	@Autowired
	RefillService rs;
	@Autowired
	SaleListService ss;
	@Autowired
	ContainerService cs;
	
	@MockBean
	RefillRepository repository;
	@MockBean 
	SaleListRepository sr;
	@MockBean 
	ContainerRepository cr;

	@Test
	void saveRefillTest() {
		Refill rf= new Refill(100, 10, 8, 3, 4, 4, new Date());
		when(repository.save(rf)).thenReturn(rf);
		assertEquals(rf, rs.addRefill(rf));
	}
	@Test
	void addSaleTest() {
		Drink dr = new Drink(5,"Green Tea", 5.99,10,20,0,10,50);
		SaleList sl = new SaleList(10, dr, 5, new Date());
		when(sr.save(sl)).thenReturn(sl);
		assertEquals(sl, ss.addSale(sl));
	}
	@Test
	void updateContainerTest() throws ResourceNotFoundException 
	{
		Container ctn = new Container(3,2,3,2,3,2);
		when(cr.save(ctn)).thenReturn(ctn);
		assertEquals(ctn, cs.updateContainer(ctn));
	}
}
