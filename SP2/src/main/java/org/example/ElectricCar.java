package org.example;

public class ElectricCar extends ACar {
    private int batterCapacity;
    private int maxRange;

    public ElectricCar(int batterCapacity, int maxRange,String registrationNumber,String make,String model, int numberOfDoors) {
        super(registrationNumber, make,model, numberOfDoors);
        this.batterCapacity=batterCapacity;
        this.maxRange=maxRange;

    }
        public int getMaxRangeKm()
    {
        return maxRange;
    }
    public int getWhPrKm()
    {
        return batterCapacity*1000/maxRange;
    }
    public int getRegistrationFee()
    {
        int kmPrLitre = (int) Math.floor(100/(getWhPrKm()/91.25));
            if(kmPrLitre>= 20 && kmPrLitre<=50) {
                return 330;
            } else if (kmPrLitre>=15 && kmPrLitre<=20) {
                return 1050;
            } else if (kmPrLitre>=10 && kmPrLitre<=15) {
                return 2340;
            } else if (kmPrLitre>=5 && kmPrLitre<=10) {
                return 5500;
            } else if (kmPrLitre<5) {
                return 10470;

            }
                return 0;
    }

    public int getBatteryCapacityKWh()
    {
        return 0;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String toString()
    {
        return super.toString() +
              "\n maxrange: " + maxRange + "\n batterycapacity: " + batterCapacity + "\n ****** " + "\n";
    }
}
