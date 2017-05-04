package com.shellcore.java.interfaces;

/**
 * Created by Cesar. 04/05/2017.
 */
public class Car implements Vehicle {

    private String transportType = "Terrestial";
    private int wheels;

    public Car(int wheels) {
        this.wheels = wheels;
    }

    public int getNumberOfWheels() {
        return wheels;
    }

    @Override
    public String getTransportType() {
        return transportType;
    }

    @Override
    public boolean hasWheels() {
        return wheels > 0;
    }
}
