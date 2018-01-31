import java.io.*;
import java.util.Scanner;

public class ComputerRepairDemo
{
    public static void main(String[] args)throws IOException
    {
        Scanner kb = new Scanner(System.in);
        Customer customer;
        Computer computer;
        Costs cost;
        String damagedPart;
        final double LABOR_COST = 15.00;
        System.out.println("Welcome to ARK PC Repair.");

        //Store information of customers to Customer class

        System.out.println("What is your name?");
        String name = kb.nextLine();
        System.out.println("What is your street address?");
        String address = kb.nextLine();
        System.out.println("What is your phone number?");
        String phoneNumber = kb.nextLine();
        customer = new Customer(name, address, phoneNumber);

        //Store informations of computer to Computer class

        System.out.println("What is the name of the make?");
        String make = kb.nextLine();
        System.out.println("What is the name of the model?");
        String model = kb.nextLine();
        System.out.println("In what year was your computer manufactured?");
        int year = kb.nextInt();
        kb.nextLine();
        computer = new Computer(make, model, year);
        System.out.println();

        //Ask customer which part of the computer is damaged.
        //if the part is not in the given list, it will ask again.

        do
        {
            System.out.println("Thank you for your information, which part of your computer is damaged?");
            System.out.println("Enter CPU, GPU, RAM, POWER, or HDD: ");
            damagedPart = kb.nextLine().toUpperCase();
        } while(!damagedPart.equals("CPU") && !damagedPart.equals("GPU")
                && !damagedPart.equals("RAM") && !damagedPart.equals("POWER")
                && !damagedPart.equals("HDD"));

        //Read price and labor hours from PriceList Class

        PriceList priceList = new PriceList();
        priceList.openFile();
        double price = priceList.getPrice(damagedPart);
        int hour = priceList.getHours(damagedPart);
        priceList.closeFile();


        double laborCost = LABOR_COST * (double) hour;
        cost = new Costs(laborCost, price, hour);
        System.out.println();
        System.out.println("The cost for repairing your part is $" + cost.getComputerCost() + " and labor cost is $"
                + cost.getLabCost() + ".");
        System.out.println("Your total is $" + (cost.getComputerCost() + cost.getLabCost()) + ".");
        System.out.println();
    }
}