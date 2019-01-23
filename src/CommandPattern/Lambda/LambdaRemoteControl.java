package CommandPattern.Lambda;

public class LambdaRemoteControl {
    LambdaCommand slot;

    public LambdaRemoteControl(){}

    public void setCommand(LambdaCommand command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
