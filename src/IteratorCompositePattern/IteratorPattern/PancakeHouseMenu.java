package IteratorCompositePattern.IteratorPattern;

import java.util.ArrayList;

public class PancakeHouseMenu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<MenuItem>();

        addItem("pancake1", "pancake1", false, 2.99);
        addItem("pancake2", "pancake2", false, 1.99);
        addItem("pancake3", "pancake3", true, 3.99);
        addItem("pancake4", "pancake4", true, 6.99);
        addItem("pancake5", "pancake5", false, 1.78);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    /* not needed anymore because of iterator
    public ArrayList<MenuItem> getMenuItems(){
        return menuItems;
    }
    */

    public Iterator createIterator(){
        return new PancakeHouseMenuIterator(menuItems);
    }
}
