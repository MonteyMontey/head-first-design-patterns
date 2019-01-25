package CompoundPattern.MVC;

public interface ModelInterface {
    int getValue();
    void setValue(int value);

    void registerObserver(ObserverInterface observerInterface);
    void removeObserver(ObserverInterface observerInterface);
}
