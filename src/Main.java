import controller.Controller;
import view.AppFrame;

import java.awt.*;

/**
 * Created by Marvin on 09.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        final Controller controller = new Controller();

        EventQueue.invokeLater(() -> {
            AppFrame frame = new AppFrame(controller);
            controller.addObserver(frame);
            frame.setVisible(true);
        });

    }
}
