package org.example;

public abstract class AFuelCar extends ACar {

    private int kmPrLitre;

    public AFuelCar(int kmPrLitre,String registrationNumber,String make,String model, int numberOfDoors) {
        super(registrationNumber,make, model,numberOfDoors);
        this.kmPrLitre=kmPrLitre;
    }

    public abstract String getFuelType();

    public int getKmPrLitre()

    {
        return kmPrLitre;
    }
    @Override
    public String toString()
    {
        return super.toString()
                + "\n Km/L: " + getKmPrLitre() + "\n";
    }
}
