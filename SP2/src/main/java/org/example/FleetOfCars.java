package org.example;

import java.util.ArrayList;

public class FleetOfCars {

    public ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car)
    {
        fleet.add(car);
    }


    int getTotalRegistrationFeeForFleet()
    {
        int regResult =0;
            for(Car c : fleet) {
                regResult += c.getRegistrationFee();
            }
        return regResult;
    }


    @Override
    public String toString()
    {
        return fleet.toString();
    }

}
