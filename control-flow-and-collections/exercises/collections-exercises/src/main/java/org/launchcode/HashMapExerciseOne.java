package org.launchcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
//*     It takes in student names and ID numbers (as integers) instead of names and grades.
//    The keys should be the IDs and the values should be the names.
//    Modify the roster printing code accordingly.*/
public class HashMapExerciseOne {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter student names and ID number (or ENTER 0 to finish):");

        //Student names and IDs
        do {

            System.out.print("Student: ");
            String newStudent = input.nextLine();

            if(newStudent.equals("")) {
                break;
            }

            System.out.print("Student ID: ");
            int newId = input.nextInt();
            input.nextLine();
            if (newId == 0) {
               break;
            }

            students.put(newId, newStudent);

                // Read in the newline before looping back


        } while(true);

        input.close();

        // Print class roster
        System.out.println("\nClass roster:");
//

        for (Map.Entry<Integer, String> student : students.entrySet()) {
//
            System.out.println(student.getValue() + " (" + student.getKey() + ")");
//
        }



        }
    }

