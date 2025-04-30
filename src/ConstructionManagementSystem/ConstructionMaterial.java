package ConstructionManagementSystem;

public abstract class ConstructionMaterial {
    protected String contractorId;
    protected String contractorName;
    protected double materialQuantity;
    protected double materialBalance;

    public ConstructionMaterial(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        if (!contractorId.matches("\\d{16}")) {
            throw new IllegalArgumentException("Contractor ID must be exactly 16 digits.");
        }
        if (!contractorName.matches("[a-zA-Z\\s]{1,20}")) {
            throw new IllegalArgumentException("Contractor Name must contain only letters and be max 20 characters.");
        }
        this.contractorId = contractorId;
        this.contractorName = contractorName;
        this.materialQuantity = materialQuantity;
        this.materialBalance = materialBalance;
    }

    public abstract void receiveMaterial();
    public abstract void useMaterial();
    public abstract void estimateCost();

    // Getters and Setters
    public String getContractorId() { return contractorId; }
    public String getContractorName() { return contractorName; }
    public double getMaterialQuantity() { return materialQuantity; }
    public double getMaterialBalance() { return materialBalance; }
    public void setMaterialBalance(double materialBalance) { this.materialBalance = materialBalance; }
}