package com.company;

public abstract class Product {
    public double price;

    public Product(double price)
    {
        this.price = price;
    }
    public abstract double calculateBargainPrice();
}