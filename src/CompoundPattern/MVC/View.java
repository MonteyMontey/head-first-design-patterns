package CompoundPattern.MVC;

import javax.swing.*;
import java.awt.*;

public class View implements ObserverInterface {

    private ModelInterface model;
    private ControllerInterface controller;

    private JLabel valueOutputLabel;
    private JButton decrementButton;

    public View(ControllerInterface controller, ModelInterface model){
        this.controller = controller;
        this.model = model;
        model.registerObserver(this);
    }

    public void createView(){
        JFrame viewFrame = new JFrame("View");
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton incrementButton = new JButton("increment");
        incrementButton.setPreferredSize(new Dimension(150,50));
        incrementButton.addActionListener(e -> controller.increment());
        decrementButton = new JButton("decrement");
        decrementButton.setPreferredSize(new Dimension(150, 50));
        decrementButton.addActionListener(e -> controller.decrement());

        valueOutputLabel = new JLabel(String.valueOf(model.getValue()),SwingConstants.CENTER);
        valueOutputLabel.setPreferredSize(new Dimension(300, 50));

        viewFrame.getContentPane().add(BorderLayout.EAST, incrementButton);
        viewFrame.getContentPane().add(BorderLayout.WEST, decrementButton);
        viewFrame.getContentPane().add(BorderLayout.SOUTH, valueOutputLabel);
        viewFrame.pack();
        viewFrame.setVisible(true);
    }

    public void updateValue(){
        valueOutputLabel.setText(String.valueOf(model.getValue()));
    }

    public void enableDecrementButton(){
        decrementButton.setEnabled(true);
    }

    public void disableDecrementButton(){
        decrementButton.setEnabled(false);
    }
}
