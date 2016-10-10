package com.savko.second.entity;

public class TruckBus extends Car {

    private int countOfDrivers;

    public TruckBus(int carId, String model, String color, int cost,
                    int fuelConsumption, int passengerCapacity, int bearingCapacity, int countOfDrivers) {
        super(carId, model, color, cost, fuelConsumption, passengerCapacity, bearingCapacity);
        this.countOfDrivers = countOfDrivers;
    }

    public int getCountOfDrivers() {
        return countOfDrivers;
    }

    public void setCountOfDrivers(int countOfDrivers) {
        this.countOfDrivers = countOfDrivers;
    }

    public String toString() {
        return super.toString() + ", " +
                "Count of drivers - " + getCountOfDrivers() + ", " +
                "Type - " + TypeOfTaxi.TRUCK_BUS.toString() + "\n";
    }
}
