package com.savko.second.runner;

import com.savko.second.creator.TaxiStationCreator;
import com.savko.second.entity.TaxiStation;
import com.savko.second.exception.TaxiStationCreateException;
import org.apache.log4j.Logger;

public class AppRunner {

    private final static Logger LOGGER = Logger.getLogger(AppRunner.class);

    public static void main(String[] args) {
        LOGGER.info("Program started");

        try {
            TaxiStation taxiStation = TaxiStationCreator.buildTaxiStation("data/TaxiStationOne.txt");
            LOGGER.info(taxiStation);
        } catch (TaxiStationCreateException e) {
            LOGGER.error("Unable to create station from file", e);
        }

        LOGGER.info("Program ended");
    }

}
