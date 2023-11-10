package org.example;

public abstract class ACar implements Car
{
    String registrationNumber;
    String make;
    String model;
    int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
    this.registrationNumber=registrationNumber;
    this.make=make;
    this.model=model;
    this.numberOfDoors=numberOfDoors;
    }

    public String getRegistrationNumber()
    {
        return "";
    }

    public String getMake()
    {
        return "";
    }
    public String getModel()
    {
        return model;
    }

    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return " registrationNumber: " + registrationNumber + "\n" +
                " make: " + make + "\n" +
                " model: " + model + "\n" +
                 " numberOfDoors: " + numberOfDoors;
    }
}
