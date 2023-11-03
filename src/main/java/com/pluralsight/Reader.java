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
            if (parts.length >= 5) {
                String make = parts[0];
                String model = parts[1];
                int year = Integer.parseInt(parts[2]);
                String color = parts[3];
                double price = Double.parseDouble(parts[4]);

                Cars.put(make, new Vehicle(make, model, year, color, price));
                count++;
                inventory = new ArrayList<>(Cars.values());
            }
        }
    }
}
