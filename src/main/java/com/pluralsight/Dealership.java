package com.pluralsight;

import java.io.IOException;
import java.util.*;

public class Dealership {
    public static Scanner myScanner = new Scanner(System.in);
    public static HashMap<String, Vehicle> Cars = new HashMap<>();
    static int count = 0;
    public static ArrayList<Vehicle> inventory = new ArrayList<>(Cars.values());

    public static void dealership() throws IOException {
        String dealershipScreen;
        do {
            System.out.println("Welcome to RR Rides");
            System.out.println("1174 Car Ln");
            System.out.println("(704)434-2234\n");
            System.out.println("Search Bar");
            System.out.println("(1) Price Range");
            System.out.println("(2) Make and Model");
            System.out.println("(3) Vehicle Year");
            System.out.println("(4) Vehicle Color");
            System.out.println("(5) Vehicle Mileage");
            System.out.println("(6) Vehicle Type");
            System.out.println("(7) All Vehicles");
            System.out.println("(8) Add Vehicle");
            System.out.println("(9) Remove Vehicle");
            System.out.println("(0) Quit");
            dealershipScreen = myScanner.next();
            myScanner.nextLine();

            switch (dealershipScreen) {
                case "1":
                    getVehiclesByPrice();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                case "9":
                    break;
                case "0":
                    System.out.println("You have exited");
                    break;
                default:
                    System.out.println("Not an option, pick 1-9 or 0");
            }
        }
        while (!dealershipScreen.equals("4"));
    }


    public static void getVehiclesByPrice() {
        System.out.println("What's your minimum price? ");
        String userInput = myScanner.nextLine();
        double min = Double.parseDouble(userInput);

        System.out.println("What's your maximum price? ");
        String userInput2 = myScanner.nextLine();
        double max = Double.parseDouble(userInput2);

       boolean

    }
}


