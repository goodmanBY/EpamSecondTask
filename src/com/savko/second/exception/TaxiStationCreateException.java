package com.savko.second.exception;

public class TaxiStationCreateException extends Exception {

    public TaxiStationCreateException() {
    }

    public TaxiStationCreateException(String message) {
        super(message);
    }

    public TaxiStationCreateException(String message, Throwable cause) {
        super(message, cause);
    }

    public TaxiStationCreateException(Throwable cause) {
        super(cause);
    }

}
