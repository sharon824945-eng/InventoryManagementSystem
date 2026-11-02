package com.InventorySystem;


public class Transaction {

    private String transactionId;
    private String transactionType;
    private int quantity;

    public Transaction(String transactionId,
                       String transactionType,
                       int quantity) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Quantity: " + quantity);
    }
}
