package com.savko.second.tool;


import com.savko.second.comparator.FuelComparator;
import com.savko.second.entity.Car;
import com.savko.second.entity.TaxiStation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaxiStationTools {

    public static int calculateCostOfTaxiStation(TaxiStation station) {
        int result = 0;
        for (Car c : station.getCars()) {
            result += c.getCost();
        }
        return result;
    }

    public static List<Car> findCarByPassengerCapacity(TaxiStation station, int d1, int d2) {
        List<Car> list = new ArrayList<>();
        for (Car car : station.getCars()) {
            if ((car.getPassengerCapacity() >= d1 && car.getPassengerCapacity() <= d2)
                    || ((car.getPassengerCapacity() <= d1 && car.getPassengerCapacity() >= d2))) {
                list.add(car);
            }
        }
        return list;
    }

    public static List<Car> findCarByBearingCapacity(TaxiStation station, int d1, int d2) {
        List<Car> list = new ArrayList<>();
        for (Car car : station.getCars()) {
            if ((car.getBearingCapacity() >= d1 && car.getBearingCapacity() <= d2)
                    || ((car.getBearingCapacity() <= d1 && car.getBearingCapacity() >= d2))) {
                list.add(car);
            }
        }
        return list;
    }

    public static void sortByFuelConsumption(TaxiStation station) {
        Collections.sort(station.getCars(), new FuelComparator());
    }

}
