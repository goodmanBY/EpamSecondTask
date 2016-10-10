package com.savko.second.entity;

public class Taxi extends PassengerCar {

    private boolean businessClass;

    public Taxi(int carId, String model, String color, int cost, int fuelConsumption,
                int passengerCapacity, int bearingCapacity, boolean businessClass, boolean wiFi) {
        super(carId, model, color, cost, fuelConsumption, passengerCapacity, bearingCapacity, wiFi);
        this.businessClass = businessClass;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "Bearing Capacity - " + getBearingCapacity() + ", " +
                "Business Class - " + isBusinessClass() + ", " +
                "Wi-Fi - " + isWiFi() + ", " +
                "Type - " + TypeOfTaxi.TAXI.toString() + "\n";
    }
}
