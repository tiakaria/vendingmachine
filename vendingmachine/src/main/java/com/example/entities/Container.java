package com.example.entities;

import javax.persistence.*;

@Entity
@Table(name="CONTAINERS")
public class Containers {
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
