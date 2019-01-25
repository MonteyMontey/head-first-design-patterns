package AdapterFacadePattern.Adapter;

// There are two kinds of adapters, object adapters and class adapters
// This example is an object adapter

//  class adapters is when the turkeyAdapter doesn't hold the Turkey object (composition) but if it inherits the target class
// that's not possible in java though, as it would need to inherits two classes (duck & turkey).

public class AdapterRun {
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
