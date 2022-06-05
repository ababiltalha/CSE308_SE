package QueueManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int packageChoice, commModuleChoice, displayCount, yearCount;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter package choice:\n" +
                "1. Deluxe\n" +
                "2. Optimal\n" +
                "3. Poor");
        packageChoice= sc.nextInt();

        System.out.println("Enter communication channel choice:\n" +
                "1. WiFi\n" +
                "2. Mobile data");
        commModuleChoice= sc.nextInt();

        System.out.println("Enter number of displays required: ");
        displayCount= sc.nextInt();

        System.out.println("Enter number of years to be used: ");
        yearCount= sc.nextInt();





        Director director= new Director();
        IQMSBuilder deluxeBuilder= new DeluxeBuilder();
        IQMSBuilder optimalBuilder= new OptimalBuilder();
        IQMSBuilder poorBuilder= new PoorBuilder();

        QMSProduct product;

        switch (packageChoice){
            case 1:
                director.construct(deluxeBuilder, commModuleChoice, displayCount);
                product= deluxeBuilder.getProduct();
                product.show(yearCount);
                break;
            case 2:
                director.construct(optimalBuilder, commModuleChoice, displayCount);
                product= optimalBuilder.getProduct();
                product.show(yearCount);
                break;
            case 3:
                director.construct(poorBuilder, commModuleChoice, displayCount);
                product= poorBuilder.getProduct();
                product.show(yearCount);
                break;
            default:
                System.out.println("Invalid package choice");
        }








    }
}
