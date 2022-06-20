package Problem3a;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CalculatorAdapter extends Calculator{
    public int adaptedCalculateSum(File input) throws Exception {
        FileWriter writer= new FileWriter("temp.txt");
        Scanner scn= new Scanner(input);
        String str= scn.nextLine();
        for (int i = 0; i < str.length(); i++) {
//          System.out.println(str.charAt(i));
            if(str.charAt(i)=='~') writer.write(' ');
            else writer.write(str.charAt(i));
        }
        scn.close();
        writer.close();
//      scn= new Scanner(temp);
//      System.out.println(scn.nextLine());
        File temp= new File("temp.txt");
        return super.calculateSum(temp);
    }
}
