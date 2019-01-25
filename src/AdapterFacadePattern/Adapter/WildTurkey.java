package AdapterFacadePattern.Adapter;

public class WildTurkey implements Turkey{
    public void gobble(){
        System.out.println("*WildTurkey gobbles!*");
    }

    public void fly(){
        System.out.println("*Wild Turkey flies 5 meters!*");
    }
}
