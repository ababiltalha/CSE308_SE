package Problem3a;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            File input= new File("in.txt");
            CalculatorAdapter adapter= new CalculatorAdapter();
            System.out.println("The sum is: "+adapter.adaptedCalculateSum(input));
        } catch(Exception e){
            e.printStackTrace();
            return;
        }


    }
}
