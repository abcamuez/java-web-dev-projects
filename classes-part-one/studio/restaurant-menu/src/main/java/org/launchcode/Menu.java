package main.java.org.launchcode;

import jdk.jfr.Category;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;

    public Menu(){
        this.menuItems = new ArrayList<>();
    }

    public void addItem(MenuItem item){
        this.menuItems.add(item);
    }

    public void printMenu(){
        for (MenuItem item : menuItems){
            System.out.println("Description: " + item.getDescription() + "Price: $" + item.getPrice() + "Category: " + item.getCategories() + "New Item: " + (item.isNewOrNot() ? "Yes" : "No"));
        }
    }
}
