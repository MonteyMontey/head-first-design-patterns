package StatePattern;

public class TV {
    private State state;

    private State onState;
    private State offState;

    public TV(){
        offState = new OffState(this);
        onState = new OnState(this);

        state = offState;
    }

    public void turnOn(){
        state.turnOn();
    }

    public void turnOf(){
        state.turnOff();
    }

    public void setState(State state){
        this.state = state;
    }

    public State getOnState(){
        return onState;
    }

    public State getOffState(){
        return offState;
    }
}
