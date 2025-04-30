package TrafficFineManagementSystem;

public abstract class TrafficRecord {
    protected String driverId;
    protected String driverName;
    protected String vehiclePlate;
    protected String violationType;
    protected double fineAmount;
    protected String paymentStatus;

    public TrafficRecord(String driverId, String driverName, String vehiclePlate, String violationType) {
        if (!driverId.matches("\\d{16}")) {
            throw new IllegalArgumentException("Driver ID must be exactly 16 digits.");
        }
        if (!driverName.matches("[a-zA-Z\\s]{1,30}")) {
            throw new IllegalArgumentException("Driver name must be alphabetic and max 30 characters.");
        }
        if (!vehiclePlate.matches("RA[A-Z]\\d{3}[A-Z]")) {
            throw new IllegalArgumentException("Invalid vehicle plate format. Expected format: RAB123D.");
        }

        this.driverId = driverId;
        this.driverName = driverName;
        this.vehiclePlate = vehiclePlate;
        this.violationType = violationType.toUpperCase();
        this.paymentStatus = "UNPAID";
    }

    public abstract void recordViolation();
    public abstract void assessFine();
    public abstract void processPayment();

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public double getFineAmount() {
        return fineAmount;
    }
}
