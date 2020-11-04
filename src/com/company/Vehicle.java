package com.company;

public abstract class Vehicle extends Product {
    private String brand;
    private String model;

    public Vehicle(double price, String brand, String model)
    {
        super(price);
        this.brand = brand;
        this.model = model;
    }
    public double calculateBargainPrice()
    {
        return 0.95 * super.price;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getModel()
    {
        return model;
    }
}