package AdapterFascadePattern.Adapter;

public class MallardDuck implements Duck{
    public void quack(){
        System.out.println("*MallardDuck quacks!*");
    }
    public void fly(){
        System.out.println("*MallardDuck flies 50 meters!*");
    }
}
