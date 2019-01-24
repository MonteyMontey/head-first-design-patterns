package StatePattern;

public class OnState implements State {

    private TV tv;

    public OnState(TV tv){
        this.tv = tv;
    }

    public void turnOn(){
        System.out.println("TV is already on!");
    }

    public void turnOff(){
        System.out.println("TV is now turned off!");
        tv.setState(tv.getOffState());
    }
}
