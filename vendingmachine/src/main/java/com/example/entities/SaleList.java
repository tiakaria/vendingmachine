package com.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
@Table(name="SALE_LIST")
public class SaleList implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SALE_ID")
	private int saleListId;
	
	@JsonBackReference
    @ManyToOne
    @JoinColumn(name = "drinkId", nullable = false)
	private Drink drink;
	@Column(name="NUMBER_OF_CUP")
	private int numberOfCup;
	@Column(name="DATE")
	private Date date;
	public int getSaleListId() {
		return saleListId;
	}
	public void setSaleListId(int saleListId) {
		this.saleListId = saleListId;
	}
	public Drink getDrink() {
		return drink;
	}
	public void setDrink(Drink drink) {
		this.drink = drink;
	}
	public int getNumberOfCup() {
		return numberOfCup;
	}
	public void setNumberOfCup(int numberOfCup) {
		this.numberOfCup = numberOfCup;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
