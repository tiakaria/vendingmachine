package com.example.entities;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

@Data
@Entity
@Table(name = "Drink")
public class Drink implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DRINK_ID")
	private int id;
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
	
	
}
