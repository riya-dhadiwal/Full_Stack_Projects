package service;

import model.Product;
import model.Transaction;
import util.FileHandler;

import java.util.*;

public class InventoryService {

    private Map<Integer, Product> products = new HashMap<>();
    private List<Transaction> transactions = new ArrayList<>();

    public InventoryService() {
        products = FileHandler.loadProducts();
    }

    public void addProduct(int id, String name, int qty) {
        if (products.containsKey(id)) {
            throw new RuntimeException("Product ID already exists!");
        }
        if (qty < 0) {
            throw new RuntimeException("Quantity cannot be negative!");
        }

        products.put(id, new Product(id, name, qty));
    }

    public void sellProduct(int id, int qty) {
        Product p = products.get(id);
        if (p == null) throw new RuntimeException("Product not found!");

        if (qty > p.getQuantity()) {
            throw new RuntimeException("Insufficient stock!");
        }

        p.setQuantity(p.getQuantity() - qty);
        transactions.add(new Transaction(id, qty, "SELL"));
    }

    public void restockProduct(int id, int qty) {
        Product p = products.get(id);
        if (p == null) throw new RuntimeException("Product not found!");

        p.setQuantity(p.getQuantity() + qty);
        transactions.add(new Transaction(id, qty, "RESTOCK"));
    }

    public Collection<Product> getAllProducts() {
        return products.values();
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public List<Product> getLowStockProducts() {
        List<Product> list = new ArrayList<>();
        for (Product p : products.values()) {
            if (p.getQuantity() < 5) {
                list.add(p);
            }
        }
        return list;
    }

    public void save() {
        FileHandler.saveProducts(products.values());
    }
}