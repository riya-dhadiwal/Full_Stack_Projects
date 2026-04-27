package model;

public class Transaction {
    private int productId;
    private int quantity;
    private String type;

    public Transaction(int productId, int quantity, String type) {
        this.productId = productId;
        this.quantity = quantity;
        this.type = type;
    }

    public String toString() {
        return "Product ID: " + productId + " | Qty: " + quantity + " | Type: " + type;
    }
}