package org.launchcode;
import java.util.Scanner;
public class AreaDimensions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length = input.nextInt();
        System.out.println("Length: " + length);
        System.out.println("Enter the width of the rectangle:");
        int width = input.nextInt();
        System.out.println("Area: " + length * width);
    }
}
