package org.launchcode;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayExerciseOne {
    public static void main(String[] args) {

        int[] myArray = {1, 1, 2, 3, 5, 8};

        for(int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
            if(myArray[i] % 2 == 0){
                System.out.println("Even Numbers: " + myArray[i]);
        }
        }


    }
}
