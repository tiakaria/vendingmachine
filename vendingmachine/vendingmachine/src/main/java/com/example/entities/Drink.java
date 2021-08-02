package com.example.entities;
import java.io.Serializable;
import java.lang.invoke.InjectedProfile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

@Data
@Entity
@Table(name = "Drink")
public class Drink implements Serializable{
@Id
@Column(name = "DRINK_ID")
private int id;
@Column(name = "name")
private String name;
@Column(name = "cost")
private double cost;
@Column(name = "sugar")
private int sugar;
@Column(name = "milk")
private int milk;
@Column(name = "water")
private int water;

}
