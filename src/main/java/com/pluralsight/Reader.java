package com.pluralsight;

import java.io.*;
import java.util.ArrayList;

import static com.pluralsight.Dealership.*;

public class Reader {
    public static void reader() throws IOException {
        Cars.clear();

        FileReader fileReader = new FileReader("src/main/resources/inventory.csv");
        BufferedReader reader = new BufferedReader(fileReader);
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\\|");
            if (parts.length >= 7) {
                int vin = Integer.parseInt(parts[0]);
                int year = Integer.parseInt(parts[1]);
                String make = parts[2];
                String model = parts[3];
                String vehicleType = parts[4];
                String color = parts[5];
                int odometer = Integer.parseInt(parts[6]);
                double price = Double.parseDouble(parts[7]);

                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType,  color,  odometer, price);
                Cars.put(make, vehicle);
                inventory.add(vehicle);
            }
        }
    }
}
