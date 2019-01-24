package StatePattern;

public class OffState implements State {

    private TV tv;

    public OffState(TV tv){
        this.tv = tv;
    }
    public void turnOn(){
        System.out.println("TV is now turned on!");
        tv.setState(tv.getOnState());
    }

    public void turnOff(){
        System.out.println("TV is already off!");
    }
}
