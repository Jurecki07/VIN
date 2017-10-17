package com.TheIronYard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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


// Creating the object from our blueprint vehicleInfo
        TelematicsService telematicsService = new TelematicsService();

        // calling telematics service method
        telematicsService.Report(vehicleInfo);

    }

}










