package ObserverPattern;

// there are built in java libraries for this pattern, java.util.Observable and java.util.Observer

public class TestRun {

    public static void main (String[] args){
        ConcreteSubject concreteSubject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver1(concreteSubject);
        Observer observer2 = new ConcreteObserver2(concreteSubject);

        concreteSubject.setData(1);

        concreteSubject.removeObserver(observer2);

        concreteSubject.setData(2);
    }
}
