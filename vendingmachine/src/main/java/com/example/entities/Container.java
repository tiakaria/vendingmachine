package com.example.entities;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="CONTAINER")
public class Container {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CTN_ID")
	private int id;
	@Column(name = "TEA")
	private float teaContainer;
	@Column(name = "COFFEE")
	private float coffeeContainer;
	@Column(name = "SUGAR")
	private float sugarContainer;
	@Column(name = "WATER")
	private float waterContainer;
	@Column(name = "MILK")
	private float milkContainer;
}
