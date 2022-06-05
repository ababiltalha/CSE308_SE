package QueueManagementSystem;

public abstract class Part {
    private String name;
    private double price;

    public Part(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name: " + name + ' ' +
                ", Price: Tk. " + price;
    }
}
