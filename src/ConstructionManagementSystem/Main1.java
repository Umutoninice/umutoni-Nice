package ConstructionManagementSystem;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Contractor ID:");
        String id = scanner.nextLine();

        System.out.println("Enter Contractor Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Material Quantity (tons):");
        double quantity = scanner.nextDouble();

        double balance = 5.0; // Initial material balance for simulation

        System.out.println("-- Material Delivery ---");
        MaterialDelivery delivery = new MaterialDelivery(id, name, quantity, balance);
        delivery.receiveMaterial();
        balance = delivery.getMaterialBalance(); // Update balance

        System.out.println("\n--- Material Usage ---");
        MaterialUsage usage = new MaterialUsage(id, name, quantity, balance);
        usage.useMaterial();
        balance = usage.getMaterialBalance(); // Update balance again

        System.out.println("\n--- Cost Estimation ---");
        CostEstimation estimation = new CostEstimation(id, name, quantity, balance);
        estimation.estimateCost();

        scanner.close();
    }
}
