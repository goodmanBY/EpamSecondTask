package com.savko.second.entity;

import java.util.Comparator;

public class Car implements Comparator<Car> {

    private int carId;
    private String model;
    private String color;
    private int cost;
    private int fuelConsumption;
    private int passengerCapacity;
    private int bearingCapacity;

    public Car(int carId, String model, String color, int cost,
               int fuelConsumption, int passengerCapacity, int bearingCapacity) {
        this.carId = carId;
        this.model = model;
        this.color = color;
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.passengerCapacity = passengerCapacity;
        this.bearingCapacity = bearingCapacity;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getBearingCapacity() {
        return bearingCapacity;
    }

    public void setBearingCapacity(int bearingCapacity) {
        this.bearingCapacity = bearingCapacity;
    }

    @Override
    public int compare(Car c1, Car c2) {
        return c1.getFuelConsumption() - c2.getFuelConsumption();
    }

    @Override
    public String toString() {
        return "\n" + "Car: " +
                "Car ID - " + getCarId() + ", " +
                "Model - " + getModel() + ", " +
                "Color - " + getColor() + ", " +
                "Cost - " + getCost() + "$, " +
                "Fuel Consumption - " + getFuelConsumption() + ", " +
                "Passenger Capacity - " + getPassengerCapacity() + ", " +
                "Bearing Capacity - " + getBearingCapacity() + "\n";
    }

}
