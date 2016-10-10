package com.savko.second.factory;

import com.savko.second.entity.Car;
import com.savko.second.entity.MiniBus;
import com.savko.second.entity.Taxi;
import com.savko.second.entity.TruckBus;
import org.apache.log4j.Logger;

import java.util.Arrays;

import static com.savko.second.entity.TypeOfTaxi.*;
import static com.savko.second.utility.OptionUtility.*;

public class CarFactory {

    private final static Logger LOGGER = Logger.getLogger(CarFactory.class);

    public static Car createCar(String[] params) {
        try {
            String taxiType = params[0];
            if (TAXI.getValue().equals(taxiType)) {
                boolean businessClass = Boolean.parseBoolean(params[8]);
                boolean wiFi = Boolean.parseBoolean(params[9]);
                return new Taxi(getCarId(params), getModel(params), getColor(params), getCost(params),
                        getFuelConsumption(params), getPassengerCapacity(params), getBearingCapacity(params),
                        businessClass, wiFi);
            } else if (MINI_BUS.getValue().equals(taxiType)) {
                int seatingCapacity = Integer.parseInt(params[8]);
                boolean wiFi = Boolean.parseBoolean(params[9]);
                return new MiniBus(getCarId(params), getModel(params), getColor(params),
                        getCost(params), getFuelConsumption(params), getPassengerCapacity(params),
                        getBearingCapacity(params), seatingCapacity, wiFi);
            } else if (TRUCK_BUS.getValue().equals(taxiType)) {
                int countOfDrivers = Integer.parseInt(params[8]);
                return new TruckBus(getCarId(params), getModel(params), getColor(params),
                        getCost(params), getFuelConsumption(params), getPassengerCapacity(params),
                        getBearingCapacity(params), countOfDrivers);
            }
        } catch (NumberFormatException e) {
            LOGGER.info("Incorrect values in params - " + Arrays.toString(params));
        }
        return null;
    }
}
