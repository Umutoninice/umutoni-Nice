package HotelManagementSystem;
public class Billing extends HotelService {
    public Billing(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void generateBill() {
        int rate;
        switch (roomType) {
            case "STANDARD": rate = 50000; break;
            case "DELUXE": rate = 80000; break;
            case "SUITE": rate = 120000; break;
            default:
                System.out.println(" Invalid room type.");
                return;
        }

        int total = rate * stayDays;
        System.out.println("\n --- BILLING DETAILS ---");
        System.out.println("Guest ID   : " + guestId);
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Stay Days  : " + stayDays);
        System.out.printf("Total Bill : %,d RWF\n", total);
    }

    @Override public void bookRoom() {}
    @Override public void checkoutGuest() {}
}
