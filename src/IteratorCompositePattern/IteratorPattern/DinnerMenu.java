package IteratorCompositePattern.IteratorPattern;

public class DinnerMenu {
    static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinnerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog with onions", false, 3.05);
        // ...
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS){
            System.err.println("Sorry, menu is full! Can't add item to menu!");
        }
        else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    /* not needed anymore because of iterator
    public MenuItem[] getMenuItems(){
        return menuItems;
    }
    */

    public Iterator createIterator(){
        return new DinnerMenuIterator(menuItems);
    }
}
