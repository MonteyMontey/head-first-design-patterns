package CommandPattern;

import CommandPattern.Lambda.LambdaRemoteControl;

public class RemoteControlTest {

    // useful for .... remotes? , but also queuing and pipeline stuff

    public static void main(String[] args){

        // simple remote

        System.out.println("--Simple Remote-- \n");
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light bathroomLight = new BathroomLight();
        LightOnCommand lightOn = new LightOnCommand(bathroomLight);

        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();

        // advanced remote

        System.out.println("\n--Advanced Remote-- \n");
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl();
        Light kitchenLight = new KitchenLight();
        lightOn = new LightOnCommand(kitchenLight);
        advancedRemoteControl.setCommand(lightOn, 1);

        advancedRemoteControl.buttonWasPressed(1);
        advancedRemoteControl.undoButtonWasPushed();

        // makro command

        System.out.println("\n--Makro Command--\n");
        Command[] commands = {lightOn, lightOn, lightOn};
        MacroCommand macroCommand = new MacroCommand(commands);
        advancedRemoteControl.setCommand(macroCommand, 6);
        advancedRemoteControl.buttonWasPressed(6);

        // you can replace classes with lambda expressions

        System.out.println("\n--Lambda instead of Classes--\n");

        // would work if we didn't implement the undo method because it works only if there's one method which can be replaced
        // by the lambda

        KitchenLight kitchenLightTest = new KitchenLight();
        LambdaRemoteControl lambdaRemoteControl = new LambdaRemoteControl();
        lambdaRemoteControl.setCommand(() -> {kitchenLight.on();});  //method reference works too
        lambdaRemoteControl.buttonWasPressed();
    }
}