package CommandPattern;

// with undo functionality and multiple slots

public class AdvancedRemoteControl {
    private Command[] slots;
    private Command undoCommand;

    public AdvancedRemoteControl(){
        slots = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++){
            slots[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(Command command, int slot){
        slots[slot] = command;
    }

    public void buttonWasPressed(int slot){
        slots[slot].execute();
        undoCommand = slots[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
