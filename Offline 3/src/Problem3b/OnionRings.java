package Problem3b;

public class OnionRings extends BurgerDecorator {
    OnionRings(Burger burger) {
        super(burger);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+32;
    }

    @Override
    public String showDetails() {
        return super.showDetails()+", with onion rings";
    }
}
