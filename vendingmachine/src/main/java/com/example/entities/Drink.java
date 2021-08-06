package com.example.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
}
