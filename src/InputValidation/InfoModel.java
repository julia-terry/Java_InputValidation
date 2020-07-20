package InputValidation;

public class InfoModel {
    private String finalDate;
    private String name;
    private double cost;
    private int count;
    private double totalCost;


    // Getters and Setters
    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {    
        // make sure cost is positive
        if (cost > 0.0) {
            this.cost = cost;
            // recalculate totalCost
            this.totalCost = this.cost * this.count;
        }
    }

    public double getTotalCost() {
        return totalCost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        // make sure count is positive
        if (count > 0) {
            this.count = count;
            // recalculate totalCost
            this.totalCost = this.cost * this.count;
        }
    }

    
    
}
