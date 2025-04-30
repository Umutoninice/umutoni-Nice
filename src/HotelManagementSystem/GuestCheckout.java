package HotelManagementSystem;

public class GuestCheckout extends HotelService {
    public GuestCheckout(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void checkoutGuest() {
        if (roomStatus.equals("OCCUPIED")) {
            setRoomStatus("AVAILABLE");
            System.out.println("Guest " + guestName + " has been successfully checked out.");
        } else {
            System.out.println("Checkout failed: Room is already available.");
        }
    }

    @Override public void bookRoom() {}
    @Override public void generateBill() {}
}