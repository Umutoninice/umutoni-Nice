package TrafficFineManagementSystem;

public class FinePayment extends TrafficRecord {
    public FinePayment(String driverId, String driverName, String vehiclePlate, String violationType, double fineAmount, String paymentStatus) {
        super(driverId, driverName, vehiclePlate, violationType);
        this.fineAmount = fineAmount;
        this.paymentStatus = paymentStatus;
    }

    @Override
    public void processPayment() {
        if (paymentStatus.equalsIgnoreCase("PAID")) {
            System.out.println(" Payment already processed for this violation.");
        } else {
            setPaymentStatus("PAID");
            System.out.println("Payment received.");
            System.out.println("Receipt:");
            System.out.println("Driver: " + driverName);
            System.out.println("Plate: " + vehiclePlate);
            System.out.printf("Amount Paid: %,d RWF\n", (int)fineAmount);
            System.out.println("Status: " + paymentStatus);
        }
    }

    @Override public void recordViolation() {}
    @Override public void assessFine() {}
}
