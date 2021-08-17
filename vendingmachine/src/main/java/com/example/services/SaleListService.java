package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Container;
import com.example.entities.SaleList;
import com.example.exception.ResourceNotFoundException;
import com.example.repositories.ContainerRepository;
import com.example.repositories.SaleListRepository;

@Service
public class SaleListService {
	
	@Autowired
	private SaleListRepository sr;
	
	@Autowired
	private ContainerRepository cr;
	
	public Optional<SaleList> getSaleById(int id)
			throws ResourceNotFoundException
	{
				return sr.findById(id);
			}
	
	public SaleList addSale(SaleList sl)
	throws ResourceNotFoundException
	{	
		SaleList rs = sr.save(sl);
		if (rs!=null) {
			//update available containers
			Container tmpCtn = cr.getById(1);
			tmpCtn.setCoffeeContainer(tmpCtn.getCoffeeContainer() - (float)rs.getNumberOfCup()*rs.getDrink().getCoffee()/1000);
			tmpCtn.setMilkContainer(tmpCtn.getMilkContainer() - (float)rs.getNumberOfCup()*rs.getDrink().getMilk()/1000);
			tmpCtn.setSugarContainer(tmpCtn.getSugarContainer() - (float)rs.getNumberOfCup()*rs.getDrink().getSugar()/1000);
			tmpCtn.setTeaContainer(tmpCtn.getTeaContainer() - (float)rs.getNumberOfCup()*rs.getDrink().getTea()/1000);
			tmpCtn.setWaterContainer(tmpCtn.getWaterContainer() - (float)rs.getNumberOfCup()*rs.getDrink().getWater()/1000);
			cr.save(tmpCtn);
		}
		return rs;
	}
	
	public List<SaleList> findAll(){
		return sr.findAll();
	}
	
	public List<SaleList> findByDrinkId(int id){
		return sr.findByDrinkId(id);
	}
	
	public List<SaleList> findByToday(int drinkId){
		return sr.findByToday(drinkId);
	}
}
