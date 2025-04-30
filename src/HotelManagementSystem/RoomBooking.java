package HotelManagementSystem;
public class RoomBooking extends HotelService {
    public RoomBooking(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void bookRoom() {
        if (stayDays < 1 || stayDays > 30) {
            System.out.println(" Booking failed: Stay duration must be between 1 and 30 days.");
        } else if (!roomStatus.equals("AVAILABLE")) {
            System.out.println("Booking failed: Room is not available.");
        } else {
            setRoomStatus("OCCUPIED");
            System.out.println("Booking confirmed for " + guestName + " (" + guestId + ").");
            System.out.println("Room Type: " + roomType + " | Stay: " + stayDays + " days");
        }
    }

    @Override public void checkoutGuest() {}
    @Override public void generateBill() {}
}
