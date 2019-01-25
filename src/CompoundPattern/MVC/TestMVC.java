package CompoundPattern.MVC;


public class TestMVC {

    public static void main (String[] args){
        ModelInterface model = new ConcreteModel();
        ControllerInterface controller = new ConcreteController(model);
    }
}
