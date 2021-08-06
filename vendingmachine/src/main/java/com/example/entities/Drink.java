package com.example.entities;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
@Table(name = "Drink")
public class Drink implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DRINK_ID")
	private int drinkId;
	@Column(name = "name")
	private String name;
	@Column(name = "cost")
	private double cost;
	@Column(name = "sugar")
	private int sugar;
	@Column(name="tea")
	private int tea;
	@Column(name="coffee")
	private int coffee;
	@Column(name = "milk")
	private int milk;
	@Column(name = "water")
	private int water;
	
	@JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "drink")
    private Set<SaleList> saleLists;

	public int getDrinkId() {
		return drinkId;
	}

	public void setDrinkId(int drinkId) {
		this.drinkId = drinkId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public int getTea() {
		return tea;
	}

	public void setTea(int tea) {
		this.tea = tea;
	}

	public int getCoffee() {
		return coffee;
	}

	public void setCoffee(int coffee) {
		this.coffee = coffee;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public Set<SaleList> getSaleLists() {
		return saleLists;
	}

	public void setSaleLists(Set<SaleList> saleLists) {
		this.saleLists = saleLists;
	}
	
	

}
