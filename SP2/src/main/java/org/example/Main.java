package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!" + "\n");

        FleetOfCars fleet = new FleetOfCars();

        Car gas = new GasolinCar(12,"2200","VW","Beetle",3);
        Car diesel = new DieselCar(13,true,"2044","Toyota","Yaris",5);
        Car electric = new ElectricCar(18,140,"2860","Peugeot","107",5);

        fleet.addCar(gas);
        fleet.addCar(diesel);
        fleet.addCar(electric);

        System.out.println(" total registration fleet: "+ fleet.getTotalRegistrationFeeForFleet()+ "\n");
        System.out.println(gas);
        System.out.println(diesel);
        System.out.println(electric);

      //  System.out.println(fleet);
    }
}

