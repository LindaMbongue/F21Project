package com.company;


public class Item {

    private String description;
    private String category;
    private float cost;
    private int stock;

    public Item(String description, String category, float cost, int stock) {
        this.description = description;
        this.category = category;
        this.cost = cost;
        this.stock = stock;
    }


    //Getters
    public String getDescription() {
        return description;
    }

    //Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int variation) {

            this.stock+=variation;

    }

    @Override
    public String toString() {
        return "Name: " + description + "\n"
               + "Category: " + category + "\n"
               + "Cost: " + cost + "\n"
               + "Stock: " + stock + "\n\n";
    }
}