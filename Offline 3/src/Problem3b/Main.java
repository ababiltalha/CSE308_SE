package Problem3b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        Menu menu= new Menu();

        System.out.println("Menu:\n1. Beef burger with French fry and cheese\n" +
                "2. Veggi burger with onion rings and Bottle of Water\n" +
                "3. A combo meal with Veggi burger, French Fry and Coke\n" +
                "4. A combo meal with Veggi burger, Onion Rings, Coffee and Water\n" +
                "5. A Beef burger only");
        menu.makeOrder(scn.nextInt());
        menu.printOrder();



    }
}
