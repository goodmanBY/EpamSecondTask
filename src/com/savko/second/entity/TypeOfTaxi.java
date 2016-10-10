package com.savko.second.entity;

public enum TypeOfTaxi {

    TAXI("taxi"), MINI_BUS("minibus"), TRUCK_BUS("truckbus");

    public String value;

    TypeOfTaxi(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
