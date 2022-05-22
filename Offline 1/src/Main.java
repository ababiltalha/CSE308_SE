import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        Bank bank=new Bank();
        while (true) {
//            System.out.println("Debugger breakpoint");
            String s = scn.nextLine();
            String[] command = s.split(" ");
            if (command[0].equalsIgnoreCase("Exit")) {
                break;
            }
            if (command[0].equalsIgnoreCase("Create")) {
                bank.createAccount(command[1],command[2], Double.parseDouble(command[3]));
            } else if (command[0].equalsIgnoreCase("Deposit")) {
                bank.deposit(Double.parseDouble(command[1]));
            } else if (command[0].equalsIgnoreCase("Withdraw")) {
                bank.withdraw(Double.parseDouble(command[1]));
            } else if (command[0].equalsIgnoreCase("Query")) {
                bank.query();
            } else if (command[0].equalsIgnoreCase("Request")) {
                bank.request(Double.parseDouble(command[1]));
            } else if (command[0].equalsIgnoreCase("Open")) {
                bank.openUser(command[1]);
            } else if (command[0].equalsIgnoreCase("Close")) {
                bank.closeUser();
            } else if (command[0].equalsIgnoreCase("Approve")) {
                bank.approve();
            } else if (command[0].equalsIgnoreCase("Lookup")) {
                bank.lookup(command[1]);
            } else if (command[0].equalsIgnoreCase("Change")) {
                bank.change(command[1], Double.parseDouble(command[2])/100);
            } else if (command[0].equalsIgnoreCase("See")) {
                bank.see();
            } else if (command[0].equalsIgnoreCase("INC")) {
                bank.incrementClock();
            } else System.out.println("Invalid input. ");

        }

    }
}
