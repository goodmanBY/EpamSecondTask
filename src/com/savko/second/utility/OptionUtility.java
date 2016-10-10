package com.savko.second.utility;

public class OptionUtility {

    public static int getCarId(String[] params) {
        return Integer.parseInt((params[1]));
    }

    public static String getModel(String[] params) {
        return params[2];
    }

    public static String getColor(String[] params) {
        return params[3];
    }

    public static int getCost(String[] params) {
        return Integer.parseInt((params[4]));
    }

    public static int getFuelConsumption(String[] params) {
        return Integer.parseInt((params[5]));
    }

    public static int getPassengerCapacity(String[] params) {
        return Integer.parseInt((params[6]));
    }

    public static int getBearingCapacity(String[] params) {
        return Integer.parseInt((params[7]));
    }

}
