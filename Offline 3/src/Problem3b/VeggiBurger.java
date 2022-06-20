package Problem3b;

public class VeggiBurger implements Burger {
    @Override
    public double getPrice() {
        return 40;
    }

    @Override
    public String showDetails() {
        return "Veggi Burger";
    }
}
