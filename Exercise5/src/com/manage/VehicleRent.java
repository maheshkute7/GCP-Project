package com.manage;

import java.lang.reflect.Type;
import java.util.Scanner;

import com.vehicles.Vehicle;

//Car rental management: entrance test class
public class VehicleRent {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VehicleOperation vehicleOpr = new VehicleOperation();
        System.out.println ("*********** Welcome to Tengfei Auto Rental Co., Ltd. *****************");
        System.out.print ("Please select the model you want to rent: 1, car 2, passenger car");
        int vehicleType = input.nextInt();

        //Get three conditions for user rental car: brand seating digital model
        String brand = "";
        int seatCount = 0;
        String type = "";

        switch(vehicleType){
            case 1: //Rental sedan gets the brand and model information of the user wants to rent.
                System.out.print("Please select the car brand you want to rent: 1, Buick 2, BMW");
                int choose = input.nextInt();
                if(choose == 1){

                    brand = "Buick";
                    System.out.print ("Please select the type of car you want to rent: 1, Boulevard 2, GL8");
                    type= (input.nextInt () == 1)? "Boulevard": "GL8";
                }else{
                    brand = "BMW";
                    System.out.print ("Please select the type of car you want to rent: 1, x6 2,550i");
                    type = (input.nextInt() == 1 )?"X6":"550i";
                }

                break;
            case 2://Rental passenger car gets the brand and seat information information of the bus wants to rent.
                System.out.print ("Please select the car brand you want to rent: 1, gold cup 2, Jinlong");
                brand = (input.nextInt() == 1)? "Golden Cup": "Golden Dragon";
                System.out.print ("Please select the number of car seats you want to rent: 1,16 2,34");
                seatCount = (input.nextInt() == 1 )?16:34;
                break;
        }

        //Initialization car information
        vehicleOpr.init();
        //Car rental
        Vehicle v = vehicleOpr.rentVehicle(brand, seatCount, type);
        //Prompt the license plate number of users to rent a car (polymorphism, depending on the specific returned car class object, call the rewritable calculation rent method)
        System.out.print ("Please enter the number of days you want to rent a car:");
        int days = input.nextInt();
        float price = v.clacRent(days);
        System.out.println ("Assigned to your car grade:" +v.getVehicleId());
        System.out.println ("The rental fee you need to pay is:" + price + "Yuan");
    }
}
