package org.launchcode;
import java.util.Scanner;
public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of miles driven:");
        double miles = input.nextDouble();
        System.out.println("Miles Driven: " + miles);
        System.out.println("Enter the amount of gallons:");
        int gallon = input.nextInt();
        System.out.println("Gallons: " + gallon);
        double milesPerGallon = miles/gallon;
        System.out.println("Miles per gallon: " + milesPerGallon + "mpg");

    }
}
