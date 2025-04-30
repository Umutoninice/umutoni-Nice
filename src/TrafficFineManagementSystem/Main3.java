package TrafficFineManagementSystem;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Driver ID (16 digits): ");
        String id = scanner.nextLine();
        if (!id.matches("\\d{16}")) {
            System.out.println("Error: Invalid National ID.");
            return;
        }

        System.out.print("Enter Driver Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Vehicle Plate (e.g., RAB123D): ");
        String plate = scanner.nextLine();
        if (!plate.matches("[A-Z]{3}\\d{3}[A-Z]")) {
            System.out.println("Error: Invalid plate format.");
            return;
        }

        System.out.print("Enter Violation Type (SPEEDING/RED_LIGHT/NO_HELMET/DUI): ");
        String violation = scanner.nextLine();

        ViolationEntry entry = new ViolationEntry(id, name, plate, violation);
        entry.recordViolation();


        FineAssessment assessment = new FineAssessment(id, name, plate, violation);
        assessment.assessFine();


        double assessedFine = assessment.fineAmount;
        String status = entry.paymentStatus;


        FinePayment payment = new FinePayment(id, name, plate, violation, assessedFine, status);
        payment.processPayment();

        scanner.close();
    }
}

