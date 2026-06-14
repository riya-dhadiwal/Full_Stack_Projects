import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class ECommerceApp {

    static ArrayList<Product> products = new ArrayList<>();
    static ArrayList<Product> cart = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Product Catalog
        products.add(new Product(1, "Laptop", 60000));
        products.add(new Product(2, "Mobile", 20000));
        products.add(new Product(3, "Headphones", 3000));
        products.add(new Product(4, "Smart Watch", 5000));
        products.add(new Product(5, "Keyboard", 1500));

        int choice;

        do {
            System.out.println("\n===== MINI E-COMMERCE APPLICATION =====");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. Remove Product from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Products:");
                    System.out.println("--------------------------------");
                    for (Product p : products) {
                        System.out.println(
                                p.id + ". " + p.name + " - ₹" + p.price);
                    }
                    break;

                case 2:
                    System.out.print("Enter Product ID to Add: ");
                    int addId = sc.nextInt();

                    boolean found = false;

                    for (Product p : products) {
                        if (p.id == addId) {
                            cart.add(p);
                            System.out.println(
                                    p.name + " added to cart.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product not found!");
                    }
                    break;

                case 3:
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty!");
                        break;
                    }

                    System.out.print(
                            "Enter Product ID to Remove: ");
                    int removeId = sc.nextInt();

                    boolean removed = false;

                    for (int i = 0; i < cart.size(); i++) {
                        if (cart.get(i).id == removeId) {
                            System.out.println(
                                    cart.get(i).name +
                                    " removed from cart.");
                            cart.remove(i);
                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println(
                                "Product not found in cart!");
                    }
                    break;

                case 4:
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty!");
                    } else {
                        double cartTotal = 0;

                        System.out.println("\nItems in Cart:");
                        System.out.println("-------------------------");

                        for (Product p : cart) {
                            System.out.println(
                                    p.name + " - ₹" + p.price);
                            cartTotal += p.price;
                        }

                        System.out.println(
                                "Current Total: ₹" + cartTotal);
                    }
                    break;

                case 5:

                    if (cart.isEmpty()) {
                        System.out.println(
                                "Cart is empty! Add products first.");
                        break;
                    }

                    double total = 0;

                    System.out.println(
                            "\n========== FINAL BILL ==========");

                    for (Product p : cart) {
                        System.out.println(
                                p.name + " - ₹" + p.price);
                        total += p.price;
                    }

                    double discountRate = 0;

                    if (total >= 25000) {
                        discountRate = 0.15;
                    } else if (total >= 15000) {
                        discountRate = 0.13;
                    } else if (total >= 5000) {
                        discountRate = 0.10;
                    }

                    double discount = total * discountRate;
                    double amountAfterDiscount =
                            total - discount;

                    double gst =
                            amountAfterDiscount * 0.18;

                    double finalAmount =
                            amountAfterDiscount + gst;

                    System.out.println("--------------------------------");
                    System.out.println(
                            "Subtotal: ₹" + total);
                    System.out.println(
                            "Discount: ₹" + discount);
                    System.out.println(
                            "Amount After Discount: ₹"
                                    + amountAfterDiscount);
                    System.out.println(
                            "GST (18%): ₹" + gst);
                    System.out.println("--------------------------------");
                    System.out.println(
                            "Final Amount: ₹"
                                    + finalAmount);
                    System.out.println(
                            "================================");
                    System.out.println(
                            "Thank You For Shopping!");

                    break;

                case 6:
                    System.out.println(
                            "Exiting Application...");
                    break;

                default:
                    System.out.println(
                            "Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
