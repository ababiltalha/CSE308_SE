package Problem3b;

public class Coffee extends BurgerDecorator {
    Coffee(Burger burger) {
        super(burger);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+15;
    }

    @Override
    public String showDetails() {
        return super.showDetails()+", and Coffee";
    }
}
