package ConstructionManagementSystem;
import java.text.DecimalFormat;
public class CostEstimation extends ConstructionMaterial {
    public CostEstimation(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        super(contractorId, contractorName, materialQuantity, materialBalance);
    }

    @Override
    public void estimateCost() {
        if (materialQuantity <= 0) {
            System.out.println("Invalid quantity for cost estimation.");
            return;
        }

        double costPerTon = (materialQuantity > 15) ? 180000 : 200000;
        double totalCost = materialQuantity * costPerTon;

        System.out.println("\n --- COST ESTIMATION ---");
        System.out.println("Contractor ID   : " + contractorId);
        System.out.println("Contractor Name : " + contractorName);
        System.out.println("Material Used   : " + materialQuantity + " tons");
        System.out.printf("Total Cost      : %, .2f RWF\n", totalCost);
    }

    @Override public void receiveMaterial() {}
    @Override public void useMaterial() {}
}
