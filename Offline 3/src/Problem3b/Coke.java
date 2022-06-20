package Problem3b;

public class Coke extends BurgerDecorator {
    Coke(Burger burger) {
        super(burger);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+20;
    }

    @Override
    public String showDetails() {
        return super.showDetails()+", and Coke";
    }
}
