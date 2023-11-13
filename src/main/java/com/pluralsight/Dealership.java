package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.*;

public class Dealership {
    public static Scanner myScanner = new Scanner(System.in);
    public static HashMap<String, Vehicle> Cars = new HashMap<>();
    public static DecimalFormat df = new DecimalFormat("0.00");
    public static ArrayList<Vehicle> inventory = new ArrayList<>(Cars.values());

    public static void dealership() throws IOException {
        Reader.reader();
        inventory = new ArrayList<>(Cars.values());
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
                    getVehiclesMakeModel();
                    break;
                case "3":
                    getVehiclesByYearRange();
                    break;
                case "4":
                    getVehiclesByColor();
                    break;
                case "5":
                    getVehiclesByMileage();
                    break;
                case "6":
                    getVehiclesByType();
                    break;
                case "7":
                    getAllVehicles();
                    break;
                case "8":
                    addVehicle();
                    break;
                case "9":
                    break;
                case "0":
                    System.out.println("You have exited");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not an option, pick 1-9 or 0");
            }
        }
        while (!dealershipScreen.equals("0"));
    }


    public static void getVehiclesByPrice() {
        System.out.println("What's your minimum price? ");
        String userInput = myScanner.nextLine();
        double min = Double.parseDouble(userInput);

        System.out.println("What's your maximum price? ");
        String userInput2 = myScanner.nextLine();
        double max = Double.parseDouble(userInput2);

        for (Vehicle v : inventory) {
            if (v.getPrice() >= min && v.getPrice() <= max) {
                System.out.printf("Vin: %d | Year: %d | Make: %s | Model: %s | Vehicle Type: %s | Vehicle Color: %s | Mileage: %d | Price: %.2f\n",
                        v.getVin(), v.getYear(), v.getMake(), v.getModel(), v.getVehicleType(), v.getColor(), v.getOdometer(), v.getPrice());
            }
        }
    }

    public static void getVehiclesMakeModel() {
        System.out.println("What make are you looking for? ");
        String inputtedMake = myScanner.nextLine().trim();
        System.out.println("What model");
        String inputtedModel = myScanner.nextLine().trim();
        for (Vehicle v : inventory) {
            if (inputtedMake.equalsIgnoreCase(v.getMake()) && inputtedModel.equalsIgnoreCase(v.getModel())) {
                System.out.printf("Vin: %d | Year: %d | Make: %s | Model: %s | Vehicle Type: %s | Vehicle Color: %s | Mileage: %d | Price: %.2f\n",
                        v.getVin(), v.getYear(), v.getMake(), v.getModel(), v.getVehicleType(), v.getColor(), v.getOdometer(), v.getPrice());
            }
        }
    }

    public static void getVehiclesByYearRange() {
        System.out.println("What is the oldest year you'd like? ");
        String userInput = myScanner.nextLine();
        int min = Integer.parseInt(userInput);

        System.out.println("What is the newest year you'd like? ");
        String userInput2 = myScanner.nextLine();
        int max = Integer.parseInt(userInput2);

        for (Vehicle v : inventory) {
            if (v.getYear() >= min && v.getYear() <= max) {
                System.out.printf("Vin: %d | Year: %d | Make: %s | Model: %s | Vehicle Type: %s | Vehicle Color: %s | Mileage: %d | Price: %.2f\n",
                        v.getVin(), v.getYear(), v.getMake(), v.getModel(), v.getVehicleType(), v.getColor(), v.getOdometer(), v.getPrice());
            }
        }
    }

    public static void getVehiclesByColor() {
        System.out.println("What color are you looking for? ");
        String inputtedColor = myScanner.nextLine().trim();
        for (Vehicle v : inventory) {
            if (inputtedColor.equalsIgnoreCase(v.getColor())) {
                System.out.printf("Vin: %d | Year: %d | Make: %s | Model: %s | Vehicle Type: %s | Vehicle Color: %s | Mileage: %d | Price: %.2f\n",
                        v.getVin(), v.getYear(), v.getMake(), v.getModel(), v.getVehicleType(), v.getColor(), v.getOdometer(), v.getPrice());
            }
        }


    }
    public static void getVehiclesByMileage() {
        System.out.println("What is the lowest mileage you'd like? ");
        String userInput = myScanner.nextLine();
        int min = Integer.parseInt(userInput);

        System.out.println("What is the highest mileage you'd like? ");
        String userInput2 = myScanner.nextLine();
        int max = Integer.parseInt(userInput2);

        for (Vehicle v : inventory) {
            if (v.getOdometer() >= min && v.getOdometer() <= max) {
                System.out.printf("Vin: %d | Year: %d | Make: %s | Model: %s | Vehicle Type: %s | Vehicle Color: %s | Mileage: %d | Price: %.2f\n",
                        v.getVin(), v.getYear(), v.getMake(), v.getModel(), v.getVehicleType(), v.getColor(), v.getOdometer(), v.getPrice());
            }
        }
    }
    public static void getVehiclesByType(){
        System.out.println("What type of vehicle are you looking for? ");
        String type = myScanner.nextLine();

        for(Vehicle v : inventory){
            if(type.equalsIgnoreCase(v.getVehicleType())){
                System.out.printf("Vin: %d | Year: %d | Make: %s | Model: %s | Vehicle Type: %s | Vehicle Color: %s | Mileage: %d | Price: %.2f\n",
                        v.getVin(), v.getYear(), v.getMake(), v.getModel(), v.getVehicleType(), v.getColor(), v.getOdometer(), v.getPrice());
            }
        }
    }
    public static void getAllVehicles(){
        for(Vehicle v : inventory){
                System.out.printf("Vin: %d | Year: %d | Make: %s | Model: %s | Vehicle Type: %s | Vehicle Color: %s | Mileage: %d | Price: %.2f\n",
                        v.getVin(), v.getYear(), v.getMake(), v.getModel(), v.getVehicleType(), v.getColor(), v.getOdometer(), v.getPrice());
            }
        }
    public static void addVehicle() throws IOException{
        System.out.println("What is vin of the vehicle? ");
        int vin = myScanner.nextInt();

        myScanner.nextLine();

        System.out.println("What is the year of the vehicle? ");
        int year = myScanner.nextInt();

        myScanner.nextLine();

        System.out.println("What is the make of the vehicle? ");
        String make = myScanner.nextLine().trim();

        System.out.println("What is the model of the vehicle? ");
        String model = myScanner.nextLine().trim();

        System.out.println("What type of vehicle? ");
        String type = myScanner.nextLine().trim();

        System.out.println("What is the color of the vehicle? ");
        String color = myScanner.nextLine().trim();

        System.out.println("How many miles are on the vehicle? ");
        int mileage = myScanner.nextInt();

        System.out.println("How much does the vehicle cost? ");
        double price = myScanner.nextDouble();
        String priceFormatted = df.format(price);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/inventory.csv", true));

        bufferedWriter.newLine();
        bufferedWriter.write(vin + "|" + year + "|" + make + "|" + model + "|" + type + "|" + color + "|" + mileage + "|" + priceFormatted);

        bufferedWriter.close();
    }

}


