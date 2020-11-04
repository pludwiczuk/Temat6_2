package com.company;

public class Car extends Vehicle {
    private String carBody;

    Car(double price, String brand, String model,String carBody)
    {
        super(price, brand, model);
        this.carBody = carBody;
    }
    public double calculateBargainPrice()
    {
        return 0.85 * super.price;
    }
    public void setCarBody(String carBody)
    {
        this.carBody = carBody;
    }
    public String getCarBody()
    {
        return carBody;
    }
}