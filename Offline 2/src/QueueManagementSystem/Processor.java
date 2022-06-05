package QueueManagementSystem;

public abstract class Processor extends Part {
    private int displayCount;
    public Processor(String name, double price, int displayCount) {
        super(name, price);
        this.displayCount=displayCount;
    }
}
