import java.util.*;

// MODEL CLASS
class Product {
    int id;
    String name;
    int quantity;

    Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println(id + " | " + name + " | Stock: " + quantity);
    }
}

// SERVICE CLASS (Business Logic)
class InventoryService {
    HashMap<Integer, Product> products = new HashMap<>();

    // Add Product
    void addProduct(Product p) {
        if (products.containsKey(p.id)) {
            System.out.println("Product ID already exists!");
            return;
        }
        products.put(p.id, p);
        System.out.println("Product added successfully!");
    }

    // Update Product
    void updateProduct(int id, String newName, int newQty) {
        Product p = products.get(id);
        if (p != null) {
            p.name = newName;
            p.quantity = newQty;
            System.out.println("Product updated!");
        } else {
            System.out.println("Product not found!");
        }
    }

    // Delete Product
    void deleteProduct(int id) {
        if (products.remove(id) != null) {
            System.out.println("Product deleted!");
        } else {
            System.out.println("Product not found!");
        }
    }

    // Sell Product
    void sellProduct(int id, int qty) {
        Product p = products.get(id);
        if (p != null) {
            if (qty <= p.quantity) {
                p.quantity -= qty;
                System.out.println("Sold successfully!");
            } else {
                System.out.println("Insufficient stock!");
            }
        } else {
            System.out.println("Product not found!");
        }
    }

    // View Inventory
    void viewInventory() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty!");
            return;
        }
        for (Product p : products.values()) {
            p.display();
        }
    }

    // Search Product
    void searchProduct(String keyword) {
        boolean found = false;
        for (Product p : products.values()) {
            if (p.name.toLowerCase().contains(keyword.toLowerCase())) {
                p.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching products found!");
        }
    }
}

// MAIN CLASS (UI)
public class InventoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryService service = new InventoryService();
        int choice;

        do {
            System.out.println("\n1.Add 2.Update 3.Delete 4.Sell 5.View 6.Search 7.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    service.addProduct(new Product(id, name, qty));
                    break;

                case 2:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("New Quantity: ");
                    int newQty = sc.nextInt();
                    service.updateProduct(uid, newName, newQty);
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    service.deleteProduct(did);
                    break;

                case 4:
                    System.out.print("Enter Product ID: ");
                    int sid = sc.nextInt();
                    System.out.print("Sell Quantity: ");
                    int sellQty = sc.nextInt();
                    service.sellProduct(sid, sellQty);
                    break;

                case 5:
                    service.viewInventory();
                    break;

                case 6:
                    sc.nextLine();
                    System.out.print("Enter search keyword: ");
                    String keyword = sc.nextLine();
                    service.searchProduct(keyword);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);
    }
}