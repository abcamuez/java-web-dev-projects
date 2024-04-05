package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingStudio {
    public static void main(String[] args) {

        String HiddenFigureString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//
        char[] charactersInString = HiddenFigureString.toCharArray();
        Map<Character, Integer> character = new HashMap<>();


//

            for (char c : charactersInString) {
                character.put(c, character.getOrDefault(c, 0) + 1);
//                System.out.println(c);
            }
        System.out.println("Character counts: ");
            for (Map.Entry<Character, Integer> entry : character.entrySet()) {
                System.out.println("'" + entry.getKey() + "': " + entry.getValue());

        }

           Scanner input = new Scanner(System.in);

        System.out.println("Enter a string (or ENTER to finish):");
                String myString = input.nextLine();

        char[] userChar = myString.toCharArray();
        Map<Character, Integer> userCharacterCount = new HashMap<>();


//
        System.out.println("Number of character counts: ");
        for (char c : userChar) {
            userCharacterCount.put(c, userCharacterCount.getOrDefault(c, 0) + 1);

        }
        for(Map.Entry<Character, Integer> entry : userCharacterCount.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}
