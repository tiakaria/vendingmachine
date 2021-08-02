package com.example.entities;

@Entity
public class Coffee extends Drink{
    @CoffeeQuantity
    @Column(name = "COFFEE_QUANTITY")
    private int coffeeQuantity;

}
