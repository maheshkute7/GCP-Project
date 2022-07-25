package com.vehicles;

//Subcrete: Car
public class Car extends Vehicle {
    //model
    private String type;

    public Car(){}
    public Car(String vehicleId, String brand, int perRent,String type){
        super(vehicleId,brand,perRent);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Reward the parent class method according to the rules of the rent of the rent
    public float clacRent(int days) {
        //Rent = date rent * rental cycle
        float price = this.getPerRent() * days;
        //Discount rule
        if(days>7 && days<=30){
            price *=  0.9f;
        }else if(days>30 &&days<=150){
            price *=  0.8f;
        }else if(days>150){
            price *=  0.7f;
        }
        return price;
    }

}