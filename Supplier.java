package com.InventorySystem;

public class Supplier {


    private String supplierId;
    private String supplierName;

    public Supplier(String supplierId, String supplierName) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
    }

    public void display() {
        System.out.println("Supplier ID: " + supplierId);
        System.out.println("Supplier Name: " + supplierName);
    }
}

