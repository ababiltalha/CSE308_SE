package Problem3b;

public class ChickenBurger implements Burger {
    @Override
    public double getPrice() {
        return 70;
    }

    @Override
    public String showDetails() {
        return "Chicken burger";
    }
}
