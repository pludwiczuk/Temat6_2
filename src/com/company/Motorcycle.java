package com.company;

public class Motorcycle extends Vehicle {
    private String typeOfDrive;

    Motorcycle(double price, String brand, String model, String typeOfDrive)
    {
        super(price, brand, model);
        this.typeOfDrive = typeOfDrive;
    }
    public double calculateBargainPrice()
    {
        return 0.9 * super.price;
    }
    public void setTypeOfDrive(String typeOfDrive)
    {
        this.typeOfDrive = typeOfDrive;
    }
    public String getTypeOfDrive()
    {
        return typeOfDrive;
    }
}