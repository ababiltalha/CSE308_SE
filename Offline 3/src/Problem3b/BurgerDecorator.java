package Problem3b;

public abstract class BurgerDecorator implements Burger {
    private Burger burger;

    BurgerDecorator(Burger burger){
        this.burger= burger;
    }

    @Override
    public double getPrice() {
        return burger.getPrice();
    }

    @Override
    public String showDetails() {
        return burger.showDetails();
    }
}
