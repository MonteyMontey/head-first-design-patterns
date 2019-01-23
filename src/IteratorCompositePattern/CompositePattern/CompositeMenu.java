package IteratorCompositePattern.CompositePattern;

import java.util.ArrayList;
import java.util.Iterator; // we don't need to implement an own iterator, java got our back yo

public class CompositeMenu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public CompositeMenu(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponent.remove(menuComponent);
    }

    public MenuComponent getChild(int i){
        return menuComponents.get(i);
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void print(){
        System.out.println("\n"+getName());
        System.out.println((", "+getDescription()));
        System.out.println("------------------");

        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
