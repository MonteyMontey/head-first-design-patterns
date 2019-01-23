package ObserverPattern;

public class ConcreteObserver1 implements Observer{

    private int data;
    private Subject subject;

    public ConcreteObserver1(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int data) {
        this.data = data;
        display();
    }

    private void display(){
        System.out.println("Current Observer1 data: "+data);
    }
}
