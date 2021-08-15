package com.example.services;
import static org.junit.Assert.*;

import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.entities.Refill;
import com.example.repositories.RefillRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RefillServiceTest{
	
	@Autowired
	RefillService rs = new RefillService();
	
	@MockBean
	RefillRepository rr;
	
	@Test
	public void testSaveRefillCase() {
		Refill r = new Refill(41, 10, 8, 3, 4, 4, new Date());
		when(rr.save(r)).thenReturn(r);
		assertEquals(r,rs.addRefill(r));
	}
	
}