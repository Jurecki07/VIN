package com.TheIronYard;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // created vechile object
        VehicleInfo vehicleInfo = new VehicleInfo();

        System.out.println("Enter Your Vin");
        vehicleInfo.setVIN(sc.nextInt());

        System.out.println("Enter your Miles");
        vehicleInfo.setOdometer(sc.nextDouble());

        System.out.println("Enter your MPG");
        vehicleInfo.setConsumption(sc.nextDouble());

        System.out.println("Enter your odometer from last oil change");
        vehicleInfo.setOdometer(sc.nextDouble());

        System.out.println("Enter your engine displacement in liters");
        vehicleInfo.setEngineDisplacement(sc.nextDouble());


// Creating the service
        TelematicsService telematicsService = new TelematicsService();

        // calling / exucting telematics service method
        telematicsService.report(vehicleInfo);


    }

}










