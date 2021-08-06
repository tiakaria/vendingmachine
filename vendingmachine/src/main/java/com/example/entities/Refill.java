package com.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
@Entity
@Table(name="REFILL")
public class Refill implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="REFILL_ID")
	private int refillId;
	@Column(name="TEA_RF")
	private int teaRefill;
	@Column(name="COFFEE_RF")
	private int coffeeRefill;
	@Column(name="SUGAR_RF")
	private int sugarRefill;
	@Column(name="WATER_RF")
	private int waterRefill;
	@Column(name="MILK_RF")
	private int milkRefill;
	@Column(name="DATE")
	private Date date;
}
