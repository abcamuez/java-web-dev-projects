package org.launchcode;
import java.util.Arrays;

public class ArrayExerciseTwo {
    public static void main(String[] args) {
        String someSentence = ("I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.");
        String[] words = someSentence.split("\\.");
        System.out.println(Arrays.toString(words));

//        for(String word : words){
//            System.out.println(word);
//        }
////        System.out.println(someSentence);
    }
}
