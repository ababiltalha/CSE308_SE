package QueueManagementSystem;

public abstract class CommModule extends Part{
    private double yearlyCost;
    public CommModule(String name, double price, double yearlyCost) {
        super(name, price);
        this.yearlyCost= yearlyCost;
    }

    public double getYearlyCost() {
        return yearlyCost;
    }
}
