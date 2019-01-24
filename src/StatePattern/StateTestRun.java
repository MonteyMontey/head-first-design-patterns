package StatePattern;


/* useful if there are a lot of states so you dont need 5 trillion if else/switch statements
* it's also easier to add new states because we only need to create a new concrete state class and add it
* with composition to the TV class*/

public class StateTestRun {
    public static void main(String[] args){
        TV tv = new TV();
        tv.turnOf();
        tv.turnOn();
        tv.turnOn();
        tv.turnOf();
    }
}
