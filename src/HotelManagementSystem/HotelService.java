package HotelManagementSystem;
public abstract class HotelService {
    protected String guestId;
    protected String guestName;
    protected String roomType;
    protected int stayDays;
    protected String roomStatus;

    public HotelService(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        if (!guestId.matches("[A-Z0-9]{6,12}")) {
            throw new IllegalArgumentException("Guest ID must be 6 to 12 alphanumeric characters.");
        }
        if (!guestName.matches("[a-zA-Z\\s]{1,30}")) {
            throw new IllegalArgumentException("Guest Name must be alphabetic and max 30 characters.");
        }
        this.guestId = guestId;
        this.guestName = guestName;
        this.roomType = roomType.toUpperCase();
        this.stayDays = stayDays;
        this.roomStatus = roomStatus.toUpperCase();
    }

    public abstract void bookRoom();
    public abstract void checkoutGuest();
    public abstract void generateBill();

    public String getGuestId() { return guestId; }
    public String getGuestName() { return guestName; }
    public String getRoomType() { return roomType; }
    public int getStayDays() { return stayDays; }
    public String getRoomStatus() { return roomStatus; }
    public void setRoomStatus(String status) { this.roomStatus = status.toUpperCase(); }
}
