package view;

import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Marvin on 09.05.2016.
 */
public class AppFrame extends JFrame implements Observer {
    private final Controller controller;
    private final JLabel label;

    public AppFrame(Controller controller) {
        super("Swing Example");
        this.controller = controller;

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel();

        label = new JLabel(String.valueOf(controller.getCount()));
        panel.add(label);

        JButton button = new JButton("Increment");
        button.addActionListener(controller::increment);
        panel.add(button);

        //Other variants

        /*
        button.addActionListener(e -> {
            controller.increment(null);
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.increment(null);
            }
        });
        */



        add(panel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        label.setText(String.valueOf(controller.getCount()));
    }
}
