import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mousevent extends Frame implements MouseListener {

  JLabel l1 = new JLabel("Mouse Testing");
  JButton b1 = new JButton("Click Me");
  TextField t1 = new TextField(20);

  mousevent() {
    setSize(400, 500);
    setVisible(true);
    setLayout(new FlowLayout());
    add(l1);
    add(b1);
    add(t1);
    addMouseListener(this);
  }

  public static void main(String[] args) {
    new mousevent();
  }
}
