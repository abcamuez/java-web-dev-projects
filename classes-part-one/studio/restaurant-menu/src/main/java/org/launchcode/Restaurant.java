package main.java.org.launchcode;
import java.util.Arrays;
import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {

Menu menu = new Menu();

        ArrayList<String> categories = new ArrayList<>(Arrays.asList("Appetizer", "Dinner", "Dessert"));

MenuItem menuItem = new MenuItem(19.99, "Yummy Toast",categories, true);

        ArrayList<String> categories1 = new ArrayList<>();
        categories1.add("Appetizer");
        MenuItem menuItem1 = new MenuItem(19.99, "Yummy Toast ", categories1, true);

        ArrayList<String> categories2 = new ArrayList<>();
        categories2.add("Dinner");
        MenuItem menuItem2 = new MenuItem(29.99, "Deluxe Burger ", categories2, false);

        menu.addItem(menuItem1);
        menu.addItem(menuItem2);

        // Print the menu
        menu.printMenu();
    }

    }

