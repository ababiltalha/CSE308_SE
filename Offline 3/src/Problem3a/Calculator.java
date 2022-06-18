package Problem3a;

import java.io.File;
import java.util.Scanner;

public class Calculator {
    public int calculateSum(File input) throws Exception {
        int sum=0;
//        System.out.println(input.getName());
        Scanner scn= new Scanner(input);
        String[] numbers= scn.nextLine().split(" ");
        for (int i = 0; i < numbers.length; i++) {
            sum+=Integer.parseInt(numbers[i]);
        }
        scn.close();
        return sum;
    }
}
