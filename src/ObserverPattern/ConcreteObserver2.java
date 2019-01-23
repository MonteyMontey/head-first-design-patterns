package ObserverPattern;

public class ConcreteObserver2 implements Observer{

    private int data;
    private Subject subject;

    public ConcreteObserver2(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int data) {
        this.data = data;
        display();
    }

    private void display(){
        System.out.println("Current Observer2 data: "+data);
    }
}
