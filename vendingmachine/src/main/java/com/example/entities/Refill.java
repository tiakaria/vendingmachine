package com.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="REFILL")
public class Refill implements Serializable{
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id @Column(name="REFILL_ID")
	private int refillId;
	@Column(name="TEA_RF")
	private int teaRefill;
	@Column(name="COFFEE_RF")
	private int coffeeTefill;
	@Column(name="SUGAR_RF")
	private int sugarRefill;
	@Column(name="WATER_RF")
	private int waterRefill;
	@Column(name="MILK_RF")
	private int milkRefill;
	@Column(name="DATE")
	private Date date;
	
}
