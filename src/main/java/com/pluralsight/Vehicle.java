package com.pluralsight;

public class Vehicle {
    private int vin;
    private final int year;
    private final String make;
    private final String model;
    private String vehicleType;
    private final String color;
    private int odometer;
    private final double price;

    public Vehicle(String make, String model, int year, String color, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }


    public double getPrice() {
        return this.price;
    }

    public int getVin() {
        return this.vin;
    }

    public int getYear() {
        return this.year;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getVehicleType() {
        return this.vehicleType;
    }

    public String getColor() {
        return this.color;
    }

    public int getOdometer() {
        return this.odometer;
    }
}
