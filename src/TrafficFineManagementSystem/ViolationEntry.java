package TrafficFineManagementSystem;
public class ViolationEntry extends TrafficRecord {
    public ViolationEntry(String driverId, String driverName, String vehiclePlate, String violationType) {
        super(driverId, driverName, vehiclePlate, violationType);
    }

    @Override
    public void recordViolation() {
        String[] allowedTypes = {"SPEEDING", "RED_LIGHT", "NO_HELMET", "DUI"};
        boolean valid = false;
        for (String type : allowedTypes) {
            if (violationType.equalsIgnoreCase(type)) {
                valid = true;
                break;
            }
        }

        if (!valid) {
            System.out.println(" Invalid violation type.");
        } else {
            System.out.println("Violation recorded for " + driverName + ".");
            System.out.println("Violation Type: " + violationType + " | Payment Status: " + paymentStatus);
        }
    }

    @Override public void assessFine() {}
    @Override public void processPayment() {}
}