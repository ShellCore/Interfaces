package com.shellcore.java.interfaces;

/**
 * Created by Cesar. 04/05/2017.
 */
public class Main {

    public static void main(String[] args) {
        Car taxi = new Car(4);
        System.out.println("¿El taxi tiene ruedas? " + taxi.hasWheels() + "(" + taxi.getNumberOfWheels() + ")");
    }
}
