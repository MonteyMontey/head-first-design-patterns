package CommandPattern;

public class KitchenLight extends Light {

    @Override
    public void on(){
        System.out.println("KitchenLight is on!");
    }

    @Override
    public void off(){
        System.out.println("KitchenLight is off!");
    }
}
