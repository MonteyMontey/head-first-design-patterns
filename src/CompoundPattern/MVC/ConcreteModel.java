package CompoundPattern.MVC;

import java.util.ArrayList;

public class ConcreteModel implements ModelInterface {
    private ArrayList<ObserverInterface> observerInterfaces = new ArrayList<>();

    private int value = 0;

    public void setValue(int value){
        this.value = value;
        notifyValueObservers();
    }

    public int getValue(){
        return value;
    }

    public void registerObserver(ObserverInterface valueObserver){
        observerInterfaces.add(valueObserver);
    }

    public void removeObserver(ObserverInterface observerInterface){
        int i = observerInterfaces.indexOf(observerInterface);
        if (i >= 0){
            observerInterfaces.remove(i);
        }
    }

    public void notifyValueObservers(){
        for (ObserverInterface observerInterface : observerInterfaces) {
            observerInterface.updateValue();
        }
    }


}
