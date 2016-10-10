package com.savko.second.comparator;

import com.savko.second.entity.Car;

import java.util.Comparator;

public class FuelComparator implements Comparator<Car> {

    @Override
    public int compare(Car c1, Car c2) {
        return c1.getFuelConsumption() - c2.getFuelConsumption();
    }

}
