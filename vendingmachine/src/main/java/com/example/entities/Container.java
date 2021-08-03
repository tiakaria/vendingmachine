package com.example.entities;

import javax.persistence.*;

@Entity
@Table(name="CONTAINER")
public class Container {
	@Id
	private static int id;
	@Column(name = "TEA")
	private static float teaContainer;
	@Column(name = "COFFEE")
	private static float coffeeContainer;
	@Column(name = "SUGAR")
	private static float sugarContainer;
	@Column(name = "WATER")
	private static float waterContainer;
	@Column(name = "MILK")
	private static float milkContainer;
}
