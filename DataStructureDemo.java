
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DataStructureDemo {

    public static void main(String[] args) {

        // ArrayList stores product names
        ArrayList<String> products = new ArrayList<>();

        products.add("Laptop");
        products.add("Keyboard");
        products.add("Mouse");

        System.out.println("=== PRODUCT LIST ===");
        for (String product : products) {
            System.out.println(product);
        }

        // HashMap stores product ID and quantity
        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("P101", 10);
        inventory.put("P102", 20);
        inventory.put("P103", 15);

        System.out.println("\n=== INVENTORY QUANTITIES ===");
        System.out.println("P101: " + inventory.get("P101"));
        System.out.println("P102: " + inventory.get("P102"));
        System.out.println("P103: " + inventory.get("P103"));

        // HashSet stores unique product categories
        HashSet<String> categories = new HashSet<>();

        categories.add("Electronics");
        categories.add("Accessories");
        categories.add("Electronics");

        System.out.println("\n=== PRODUCT CATEGORIES ===");
        for (String category : categories) {
            System.out.println(category);
        }

        System.out.println("\nTotal Products: " + products.size());
        System.out.println("Total Inventory Records: "
                           + inventory.size());
        System.out.println("Unique Categories: "
                           + categories.size());
    }
}
