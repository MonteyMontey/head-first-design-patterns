package IteratorCompositePattern.IteratorPattern;

public class MenuItem {

    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public void printMenuItem(){
      System.out.println("Name: "+name+"\n"+"Description: "+description+"\n"+"Vegetarian: "+vegetarian+"\n"+"Price: "+price);
    }
}
