package com.savko.second.entity;

public class MiniBus extends PassengerCar {

    private int seatingCapacity;

    public MiniBus(int carId, String model, String color, int cost,
                   int fuelConsumption, int passengerCapacity, int bearingCapacity, int seatingCapacity, boolean wiFi) {
        super(carId, model, color, cost, fuelConsumption, passengerCapacity, bearingCapacity, wiFi);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String toString() {
        return super.toString() + ", " +
                "Seating Capacity - " + getSeatingCapacity() + ", " +
                "Wi-Fi - " + isWiFi() + ", " +
                "Type - " + TypeOfTaxi.MINI_BUS.toString() + "\n";
    }
}
