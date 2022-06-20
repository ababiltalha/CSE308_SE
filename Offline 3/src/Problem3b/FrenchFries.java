package Problem3b;

public class FrenchFries extends BurgerDecorator {
    FrenchFries(Burger burger) {
        super(burger);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+24;
    }

    @Override
    public String showDetails() {
        return super.showDetails()+", with French fries";
    }
}
