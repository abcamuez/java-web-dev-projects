package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
//        Divide obj1 = new Divide();
        Divide(20, 0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for(Map.Entry<String, String> entry : studentFiles.entrySet()){
            try {
                int studentPoints = CheckFileExtension(entry.getValue());
                System.out.println("Score: " + studentPoints);
            } catch(IllegalArgumentException e) {
                System.out.println("Error " + entry.getValue() + ": " + e.getMessage());
            }
        }
    }

    public static int Divide(int x, int y)
    {
        try {
            int results = x/y;
            System.out.println("Auto Grating Successful");
            System.out.println("Tests results: ");
            return results;
        } catch(ArithmeticException e) {
            System.out.println("ERROR!");
return -1;
    }


        // Write code here!
    }

    public static int CheckFileExtension(String fileName)
    {
//        int studentResults = Divide(4, 0);

        // Write code here!

        if(fileName == null || fileName.isEmpty()) {
        throw new IllegalArgumentException("File not valid.");
        }
        return fileName.endsWith(".java") ? 1 : 0;
    }
}