package com.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="SALE_LIST")
public class SaleList implements Serializable{
	@Id @Column(name="SALE_ID")
	private int saleListId;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "drinkId")
	private Drink drink;
	@Column(name="NUMBER_OF_CUP")
	private int numberOfCup;
	@Column(name="DATE")
	private Date date;
	
}
