package Problem3a;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File input= new File("in.txt");
            CalculatorAdapter adapter= new CalculatorAdapter();
            Scanner scn= new Scanner(System.in);
            System.out.println("File delimiter type:" +
                    "\n1. Space" +
                    "\n2. Tilde");
            int choice= scn.nextInt();
            scn.close();
            if(choice==1){
                System.out.println(adapter.calculateSum(input," "));
            } else if(choice==2) {
                System.out.println(adapter.calculateSum(input,"~"));
            } else System.out.println("Invalid choice");
        } catch(Exception e){
            e.printStackTrace();
            return;
        }


    }
}
