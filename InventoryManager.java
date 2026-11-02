
package com.InventorySystem;

import java.util.*;

public class InventoryManager<T extends InventoryItem> {

    private HashMap<String, T> inventory = new HashMap<>();

    // Add product
    public void addItem(T item) {
        inventory.put(item.getProduct().getId(), item);
    }

    // Search by ID
    public T searchById(String id) {
        return inventory.get(id);
    }

    // Search by name
    public void searchByName(String name) {
        for (T item : inventory.values()) {
            if (item.getProduct().getName()
                    .equalsIgnoreCase(name)) {
                item.display();
            }
        }
    }

    // Sort by price using Comparator
    public void sortByPrice() {
        List<T> list = new ArrayList<>(inventory.values());

        list.sort(Comparator.comparingDouble(
            item -> item.getProduct().getPrice()
        ));

        for (T item : list) {
            item.display();
        }
    }

    // Sort by quantity using Comparator
    public void sortByQuantity() {
        List<T> list = new ArrayList<>(inventory.values());

        list.sort(Comparator.comparingInt(
            InventoryItem::getQuantity
        ));

        for (T item : list) {
            item.display();
        }
    }
}
