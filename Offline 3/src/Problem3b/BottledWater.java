package Problem3b;

public class BottledWater extends BurgerDecorator {
    BottledWater(Burger burger) {
        super(burger);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+13;
    }

    @Override
    public String showDetails() {
        return super.showDetails()+", and a bottle of water";
    }
}
