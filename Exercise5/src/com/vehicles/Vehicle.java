package com.vehicles;

//Parental class: Auto
public abstract class Vehicle {
    //License plate number brand day rent
    private String vehicleId;
    private String brand;
    private int perRent;

    public Vehicle(){}


    public Vehicle(String vehicleId, String brand, int perRent) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.perRent = perRent;
    }


    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getPerRent() {
        return perRent;
    }
    public void setPerRent(int perRent) {
        this.perRent = perRent;
    }
    //Abstract method: Calculate rent-> Calculate rent based on the rental cycle
    public abstract float clacRent(int days);
}