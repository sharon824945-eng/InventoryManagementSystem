
package com.InventorySystem;

public class Main {

    public static void main(String[] args) {

        InventoryManager<InventoryItem> manager =
                new InventoryManager<>();

        Product p1 = new Product("P101", "Laptop", 50000);
        Product p2 = new Product("P102", "Mouse", 500);
        Product p3 = new Product("P103", "Keyboard", 1000);

        manager.addItem(new InventoryItem(p1, 5));
        manager.addItem(new InventoryItem(p2, 20));
        manager.addItem(new InventoryItem(p3, 10));

        System.out.println("=== SEARCH BY ID ===");
        InventoryItem found = manager.searchById("P101");

        if (found != null) {
            found.display();
        }

        System.out.println("\n=== SEARCH BY NAME ===");
        manager.searchByName("Mouse");

        System.out.println("\n=== SORT BY PRICE ===");
        manager.sortByPrice();

        System.out.println("\n=== SORT BY QUANTITY ===");
        manager.sortByQuantity();

        System.out.println("\n=== SORT BY NAME ===");
        manager.sortByPrice();
    }
}
