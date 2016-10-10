package com.savko.second.entity;

public abstract class PassengerCar extends Car {

    private boolean wiFi;

    public PassengerCar(int carId, String model, String color, int cost, int fuelConsumption,
                        int passengerCapacity, int bearingCapacity, boolean wifi) {
        super(carId, model, color, cost, fuelConsumption, passengerCapacity, bearingCapacity);
        this.wiFi = wifi;
    }

    public boolean isWiFi() {
        return wiFi;
    }

}
