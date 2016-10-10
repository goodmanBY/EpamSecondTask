package com.savko.second.entity;

import java.util.ArrayList;
import java.util.List;

public class TaxiStation {

    private String name;
    private List<Car> cars;

    public TaxiStation(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaxiStation that = (TaxiStation) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return cars != null ? cars.equals(that.cars) : that.cars == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (cars != null ? cars.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Taxi Station: " +
                "Name of station - " + name + ", " +
                "List of cars: \n" + cars;
    }

}
