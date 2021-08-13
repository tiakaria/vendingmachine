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
public class SaleListServiceTest{
	
	@Autowired
	SaleListService ss = new SaleListService();
	
	@MockBean
	SaleListRepository sl;
	
	@Test
	public void testSaleListServiceCase() {
		Sale s = new Sale(41, 10, 8, 3, 4, 4, new Date());
		when(ss.save(s)).thenReturn(s);
		assertEquals(s,sl.addRefill(s));
	}
	
}