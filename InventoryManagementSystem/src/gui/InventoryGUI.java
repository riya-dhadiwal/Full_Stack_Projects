package gui;

import service.InventoryService;
import model.Product;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class InventoryGUI {

    private InventoryService service = new InventoryService();
    private JFrame frame;
    private JTable table;
    private DefaultTableModel model;

    public InventoryGUI() {
        frame = new JFrame("Inventory Management System");
        frame.setSize(750, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        model = new DefaultTableModel(new String[]{"ID", "Name", "Quantity"}, 0);
        table = new JTable(model);

        JScrollPane pane = new JScrollPane(table);

        JButton addBtn = new JButton("Add");
        JButton sellBtn = new JButton("Sell");
        JButton restockBtn = new JButton("Restock");
        JButton refreshBtn = new JButton("Refresh");
        JButton lowStockBtn = new JButton("Low Stock");
        JButton transactionBtn = new JButton("Transactions");

        JPanel panel = new JPanel();

        panel.add(addBtn);
        panel.add(sellBtn);
        panel.add(restockBtn);
        panel.add(refreshBtn);
        panel.add(lowStockBtn);
        panel.add(transactionBtn);

        frame.add(pane, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        addBtn.addActionListener(e -> addProduct());
        sellBtn.addActionListener(e -> sellProduct());
        restockBtn.addActionListener(e -> restockProduct());
        refreshBtn.addActionListener(e -> loadTable());
        lowStockBtn.addActionListener(e -> showLowStock());
        transactionBtn.addActionListener(e -> showTransactions());

        loadTable();

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                service.save();
            }
        });

        frame.setVisible(true);
    }

    private void loadTable() {
        model.setRowCount(0);
        for (Product p : service.getAllProducts()) {
            model.addRow(new Object[]{
                    p.getId(),
                    p.getName(),
                    p.getQuantity()
            });
        }
    }

    private void addProduct() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter ID"));
            String name = JOptionPane.showInputDialog("Enter Name");
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity"));

            service.addProduct(id, name, qty);
            loadTable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, e.getMessage());
        }
    }

    private void sellProduct() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Product ID"));
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter Sell Quantity"));

            service.sellProduct(id, qty);
            loadTable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, e.getMessage());
        }
    }

    private void restockProduct() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Product ID"));
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter Restock Quantity"));

            service.restockProduct(id, qty);
            loadTable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, e.getMessage());
        }
    }

    private void showLowStock() {
        StringBuilder msg = new StringBuilder();

        for (Product p : service.getLowStockProducts()) {
            msg.append(p.getName())
               .append(" (")
               .append(p.getQuantity())
               .append(")\n");
        }

        JOptionPane.showMessageDialog(frame,
                msg.length() == 0 ? "No low stock items" : msg.toString());
    }

    private void showTransactions() {
        StringBuilder msg = new StringBuilder();

        service.getTransactions().forEach(t ->
                msg.append(t.toString()).append("\n"));

        JOptionPane.showMessageDialog(frame,
                msg.length() == 0 ? "No transactions yet" : msg.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(InventoryGUI::new);
    }
}