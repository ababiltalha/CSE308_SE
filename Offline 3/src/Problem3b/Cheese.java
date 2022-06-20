package Problem3b;

public class Cheese extends BurgerDecorator {
    Cheese(Burger burger) {
        super(burger);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+12;
    }

    @Override
    public String showDetails() {
        return super.showDetails()+", added cheese";
    }
}
