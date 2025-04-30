package HotelManagementSystem;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Guest ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Guest Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Room Type (STANDARD/DELUXE/SUITE): ");
        String type = scanner.nextLine().toUpperCase();

        System.out.print("Enter Number of Stay Days: ");
        int days = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Initial Room Status (AVAILABLE/OCCUPIED): ");
        String status = scanner.nextLine().toUpperCase();


        RoomBooking booking = new RoomBooking(id, name, type, days, status);
        booking.bookRoom();


        GuestCheckout checkout = new GuestCheckout(id, name, type, days, booking.getRoomStatus());
        checkout.checkoutGuest();


        Billing bill = new Billing(id, name, type, days, checkout.getRoomStatus());
        bill.generateBill();

        scanner.close();
    }
}
