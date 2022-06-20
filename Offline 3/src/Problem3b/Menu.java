package Problem3b;

public class Menu {
    private Burger burger;

    public void makeOrder(int choice){
        if(choice==1){
            burger=new FrenchFries(new Cheese(new BeefBurger()));
        } else if(choice==2){
            burger=new BottledWater(new OnionRings(new VeggiBurger()));
        } else if(choice==3){
            burger=new Coke(new FrenchFries(new VeggiBurger()));
        } else if(choice==4){
            burger=new BottledWater(new Coffee(new OnionRings(new VeggiBurger())));
        } else if(choice==5){
            burger=new BeefBurger();
//        } else if(choice==0){
//            customOrder();
        } else System.out.println("Invalid choice");
    }

    public void printOrder(){
        System.out.println(burger.showDetails());
        System.out.println("Price: "+burger.getPrice());
    }

    public void customOrder(){

    }
}
