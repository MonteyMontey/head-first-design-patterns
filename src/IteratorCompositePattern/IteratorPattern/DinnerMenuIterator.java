package IteratorCompositePattern.IteratorPattern;


public class DinnerMenuIterator implements Iterator {
    private MenuItem[] items;
    private int position = 0;

    public DinnerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    public MenuItem next(){
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }
}
