package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExerciseTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("Aloha");
        strings.add("Shalom");
        strings.add("Namaste");
        strings.add("Ciao");
        strings.add("Konichiwa");

//        int words = fiveChars(strings);
        System.out.print("Enter the number of characters: ");
        int numChars = input.nextInt();
        int count = fiveChars(strings, numChars);
        System.out.println("Amount of five letter words: " + numChars + " " + "characters: " + count);
    }

    private static int fiveChars(ArrayList<String> strings, int length) {
        int count = 0;
        for (String word : strings) {
            if (word.length() == length) {
                count++;
            }

        }
        return count;

    }
}
