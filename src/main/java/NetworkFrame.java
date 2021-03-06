import javax.swing.*;
import java.awt.*;

public class NetworkFrame extends JFrame {

    public NetworkFrame(NetworkView view) throws HeadlessException {
        super();

        setSize(view.getViewSize() + 50, view.getViewSize() + 50);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Network");
        setLayout(new BorderLayout());

        add(view, BorderLayout.CENTER);
    }
}
