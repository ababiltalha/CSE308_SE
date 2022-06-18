package Problem3a;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CalculatorAdapter extends Calculator{
    public int calculateSum(File input, String delimiter) throws Exception {
        if (delimiter.equalsIgnoreCase(" "))
            return super.calculateSum(input);
        else if (delimiter.equalsIgnoreCase("~")){
            File temp= File.createTempFile("temp",".txt");
            FileWriter writer= new FileWriter(temp.getName());
            Scanner scn= new Scanner(input);
            String str= scn.nextLine();
            for (int i = 0; i < str.length(); i++) {
//                System.out.println(str.charAt(i));
                if(str.charAt(i)=='~') writer.write(' ');
                else writer.write(str.charAt(i));
            }
            scn.close();
            writer.close();
            temp.deleteOnExit();
//            scn= new Scanner(temp);
//            System.out.println(scn.nextLine());

            return super.calculateSum(temp);
        }
        else {
            System.out.println("Wrong file set for input.");
        }
        return 0;
    }
}
