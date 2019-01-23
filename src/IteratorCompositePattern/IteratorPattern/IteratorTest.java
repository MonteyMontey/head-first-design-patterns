package IteratorCompositePattern.IteratorPattern;

public class IteratorTest {
    public static void main(String args[]){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinerMenu = new DinnerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
        System.out.println("");

        // waitress doesn't need to know shit about the menu implementation, she can just
        // create an iterator and iterate trough
    }
}