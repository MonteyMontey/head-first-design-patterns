package IteratorCompositePattern.CompositePattern;

// if a menu needs to contain submenus e.g. the composite pattern can be used
// it creates a tree like object that consists of components, which can either be a leaf (lowest sub menu) or
// a composite (a submenu which contains another submenu as a child)

public class CompositeTest {
    public static void main(String args[]){
        MenuComponent pancakeHouseMenu = new CompositeMenu("Pancake House Menu", "Breakfast");
        MenuComponent dinnerHouseMenu = new CompositeMenu("Dinner House Menu", "Dinner");
        MenuComponent coffeeHouseMenu = new CompositeMenu("Coffee House Menu", "Dinner");
        MenuComponent dessertHouseMenu = new CompositeMenu("Dessert House Menu", "Dessert");

        MenuComponent allMenus = new CompositeMenu("All Menus", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerHouseMenu);
        allMenus.add(coffeeHouseMenu);
        allMenus.add(dessertHouseMenu);

        // add menu items here
        // e.g.
        dinnerHouseMenu.add(new MenuItem("Pasta","Spaghetti with blablabla", true, 3.89));

        dinnerHouseMenu.add(dessertHouseMenu);

        dessertHouseMenu.add(new MenuItem("Apple Pie", "Apple Pie with a flakey crust", true, 1.59));
        // add more menu items

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
