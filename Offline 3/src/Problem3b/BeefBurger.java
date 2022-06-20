package Problem3b;

public class BeefBurger implements Burger {
    @Override
    public double getPrice() {
        return 80;
    }

    @Override
    public String showDetails() {
        return "Beef burger";
    }
}
