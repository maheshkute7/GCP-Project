package com.vehicles;

//Subclass: Bus
public class Bus extends Vehicle {
    //number of seats
    private int seatCount;

    public Bus(){}
    public Bus(String vehicleId, String brand, int perRent,int seatCount){
        super(vehicleId,brand,perRent);
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }
    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    //Rewriting the parent class method according to the rules of the rental of the rent
    public float clacRent(int days) {
        //Rent = date rent * rental cycle
        float price = this.getPerRent() * days;
        //Discount rule
        if(days>=3 && days<7){
            price *=  0.9f;
        }else if(days>=7 &&days<30){
            price *=  0.8f;
        }else if(days>=30 && days<150){
            price *=  0.7f;
        }else if(days>=150){
            price *= 0.6f;
        }
        return price;
    }

}