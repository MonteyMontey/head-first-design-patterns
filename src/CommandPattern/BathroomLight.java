package CommandPattern;

public class BathroomLight extends Light{
    @Override
    public void on(){
        System.out.println("Bathroom light is on!");
    }

    @Override
    public void off(){
        System.out.println("Bathroom light is off!");
    }
}
