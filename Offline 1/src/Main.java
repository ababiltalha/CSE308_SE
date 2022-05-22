import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        Bank bank=new Bank();
        while (true) {
//            System.out.println("Debugger breakpoint");
            String s = scn.nextLine();
            String[] command = s.split(" ");
//            if (command[0].equalsIgnoreCase("INS")) {
//                heap.insert(Integer.parseInt(command[1]));
//                System.out.println("Inserted "+command[1]);
//            } else if (command[0].equalsIgnoreCase("INC")) {
//                heap.increaseKey(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
//                System.out.println("Increased "+command[1]+". The updated value is "+command[2]);
//            } else if (command[0].equalsIgnoreCase("FIN")) {
//                System.out.println("FindMax returned " + heap.findMax());
//            } else if (command[0].equalsIgnoreCase("EXT")) {
//                System.out.println("ExtractMax returned " + heap.extractMax());
//            } else if (command[0].equalsIgnoreCase("PRI")) {
//                heap.print();
//            } else if (command[0].equalsIgnoreCase("asdhkas"))
//                System.out.println("portesi");
//            else System.out.println("Invalid input. ");
            if (command[0].equalsIgnoreCase("EXit")) {
                break;
            }
        }

    }
}
