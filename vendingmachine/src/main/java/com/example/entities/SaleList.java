package com.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name="SALE_LIST")
public class SaleList implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SALE_ID")
	private int saleListId;
	
	@JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "drinkId", nullable = false)
	private Drink drink;
	@Column(name="NUMBER_OF_CUP")
	private int numberOfCup;
	@Column(name="DATE")
	private Date date;
}
