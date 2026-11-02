package com.InventoryJson;


import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileHandler {

    public static void saveData(String data) {
        try {
            FileWriter writer =
                new FileWriter("inventory.json");

            writer.write(data);
            writer.close();

            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data.");
        }
    }

    public static void loadData() {
        try {
            BufferedReader reader = new BufferedReader(
                new FileReader("inventory.json"));

            String line;

            System.out.println("Inventory Data:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error loading data.");
        }
    }

    public static void main(String[] args) {
        String data =
            "{\"product\":\"Laptop\",\"quantity\":10}";

        saveData(data);
        loadData();
    }
}


