import javax.swing.*;
import java.awt.*;

// AWT = Abstract Window Toolkit

public class PanelsInsideFrame extends JFrame {

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();

    JLabel l1 = new JLabel("1st pannel");
    JLabel l2 = new JLabel("2nd Pannel");

    PanelsInsideFrame() {
        setSize(500, 400);
        setVisible(true);

        p1.setBackground(Color.RED);
        p2.setBackground(Color.BLUE);
        p1.setLayout(new GridLayout(2, 1));
        // setLayout(new GridLayout(1, 3)); // Arrange panels vertically

        p1.add(l1);
        p2.add(l2);

        add(p1);
        add(p2);
    }

    public static void main(String[] args) {
        new PanelsInsideFrame();
    }
}