package main.java.org.launchcode;

//import jdk.jfr.Category;

import java.util.ArrayList;

public class MenuItem {
    private double price;
 private String description;
 private ArrayList<String> categories;
 private boolean isNewOrNot;

    public MenuItem(double price, String description,ArrayList<String> categories, boolean isNewOrNot) {
        this.price = price;
        this.description = description;
        this.categories = new ArrayList<>(categories);
        this.isNewOrNot = isNewOrNot;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

    public boolean isNewOrNot() {
        return isNewOrNot;
    }

    public void setNewOrNot(boolean newOrNot) {
        this.isNewOrNot = newOrNot;
    }
}
