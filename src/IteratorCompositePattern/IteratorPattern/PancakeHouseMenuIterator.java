package IteratorCompositePattern.IteratorPattern;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    public MenuItem next(){
        MenuItem menuItem = menuItems.get(position);
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        return position < menuItems.size() && menuItems.get(position) != null;
    }
}