package com.savko.second.creator;


import com.savko.second.entity.Car;
import com.savko.second.entity.TaxiStation;
import com.savko.second.exception.TaxiStationCreateException;
import com.savko.second.factory.CarFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class TaxiStationCreator {

    private static String LINE_DELIMITER = ",";

    public static TaxiStation buildTaxiStation(String path) throws TaxiStationCreateException {

        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(path))) {
            List<String> stringList = bufferedReader.lines().collect(Collectors.toList());
            String stationName = stringList.get(0);
            TaxiStation station = new TaxiStation(stationName);

            for (int i = 1; i < stringList.size(); i++) {
                String[] params = stringList.get(i).split(LINE_DELIMITER);
                Car car = CarFactory.createCar(params);
                station.addCar(car);
            }

            return station;

        } catch (FileNotFoundException e) {
            throw new TaxiStationCreateException("Please check your file: " + path, e);
        } catch (IOException e) {
            throw new TaxiStationCreateException("Unable to read file: " + path, e);
        }
    }

}
