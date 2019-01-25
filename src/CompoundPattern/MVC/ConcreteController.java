package CompoundPattern.MVC;

public class ConcreteController implements ControllerInterface {
    private ModelInterface model;
    private View view;

    public ConcreteController(ModelInterface model){
        this.model = model;
        view = new View(this, model);
        view.createView();
        view.disableDecrementButton();
    }

    public void increment(){
        int value = model.getValue();
        model.setValue(value+1);
        if (value == 0){
            view.enableDecrementButton();
        }
    }

    public void decrement(){
        int value = model.getValue();
        if (value == 1){
            view.disableDecrementButton();
        }
        if (value > 0){
            model.setValue(value-1);
        }
    }
}
