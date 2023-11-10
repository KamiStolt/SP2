package org.example;

public class DieselCar extends AFuelCar{
    private boolean particleFilter;
    public DieselCar(int kmPrLitre, boolean particleFilter, String registrationNumber,String make,String model, int numberOfDoors) {
        super(kmPrLitre,registrationNumber, make,model, numberOfDoors);
        this.particleFilter=particleFilter;
    }


    public int getRegistrationFee() {
        int fee = 0;

        if (getKmPrLitre() >= 20 && getKmPrLitre() <= 50) {
            fee = 330+130;

        } else if (getKmPrLitre() >= 15 && getKmPrLitre() <= 20){
            fee = 1050+1390;

        } else if (getKmPrLitre()>=10 && getKmPrLitre()<=15){
            fee=2340+1850;

        } else if (getKmPrLitre()>=5 && getKmPrLitre()<=5) {
            fee = 5500+2770;
        } else if(getKmPrLitre()<5){
            fee=10470+15260;

        } if(hasParticleFilter() == false){
         fee += 1000;
        }
        return fee;
    }

    boolean hasParticleFilter()
    {
    return particleFilter;
    }

    @Override
    public String getRegistrationNumber() {
        return null;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public String toString()
    {
        return super.toString() +
                " Has particle filter: " + hasParticleFilter()
                + "\n Fueltype: " + getFuelType();
    }
}
