package com.manage;

import com.vehicles.Bus;
import com.vehicles.Car;
import com.vehicles.Vehicle;

//Car business class
public class VehicleOperation {
    //Car array
    Vehicle[] vehicles = new Vehicle[8];

    //Car information initialization
    public void init(){
        //Upward transition
        vehicles[0] = new  Car ("India101", "BMW", 800, "X6"); //Vehicle v = new Car();
        vehicles[1] = new  Car ("mumbai102", "BMW", 600, "550i"); //Vehicle v = new Car();
        vehicles[2] = new  Car ("Pune103", "Buick", 400, "Boulevard"); //Vehicle v = new Car();
        vehicles[3] = new  Car ("Delhi104", "Buick", 500, "GL8"); //Vehicle v = new Car();
        vehicles[4] = new Bus ("Nagpur105", "Jinlong", 1000, 34); //Vehicle v = new Bus();
        vehicles[5] = new Bus ("UP106", "Jinlong", 800, 16); //Vehicle v = new Bus();
        vehicles[6] = new Bus ("Banglore107", "Golden Cup", 1200, 34); //Vehicle v = new Bus();
        vehicles[7] = new Bus ("Chennai108", "Golden Cup", 700, 16); //Vehicle v = new Bus();
    }

    //Car rental: Simple factory model
    //Parameters: Brand Seating (Bus: Brand Seating "; Car: Brand 0 Model)
    public Vehicle rentVehicle(String brand,int seatCount,String type){
        Vehicle v = null;
        //According to the car rental information (method parameters) provided by the user, the car array is traveled to find the corresponding vehicle to return to the user.
        for(Vehicle vehicle:vehicles){
            if(vehicle instanceof Car){
                //car
                Car car = (Car)vehicle; //Downward transition
                //Car brand and models with users you want, coincide with models
                if(car.getBrand().equals(brand) && car.getType().equals(type)){
                    v = car;
                    break;
                }
            }else{
                //bus
                Bus bus = (Bus)vehicle; //Downward transition
                //The brand and seat number of passenger cars are consistent with the bike brand you want.
                if(bus.getBrand().equals(brand) && bus.getSeatCount()==seatCount){
                    v = bus;
                    break;
                }
            }
        }
        return v;
    }
}