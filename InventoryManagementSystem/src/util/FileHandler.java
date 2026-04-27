package util;

import model.Product;
import java.io.*;
import java.util.*;

public class FileHandler {

    private static final String FILE = "data/products.txt";

    public static void saveProducts(Collection<Product> products) {
        try {
            File dir = new File("data");
            if (!dir.exists()) dir.mkdir();

            PrintWriter pw = new PrintWriter(new FileWriter(FILE));
            for (Product p : products) {
                pw.println(p.toFileString());
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Error saving data");
        }
    }

    public static Map<Integer, Product> loadProducts() {
        Map<Integer, Product> map = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int qty = Integer.parseInt(data[2]);

                map.put(id, new Product(id, name, qty));
            }
            br.close();

        } catch (Exception e) {
            System.out.println("No previous data found.");
        }

        return map;
    }
}