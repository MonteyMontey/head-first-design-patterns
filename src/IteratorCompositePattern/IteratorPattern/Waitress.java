package IteratorCompositePattern.IteratorPattern;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinnerMenu dinnerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinnerMenu.createIterator();

        System.out.println("Menu\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLunch");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            menuItem.printMenuItem();
        }
    }
}
