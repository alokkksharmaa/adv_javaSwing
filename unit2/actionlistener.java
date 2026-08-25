import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class actionlistener extends JFrame {
  JButton b1 = new JButton("Click Me");

  actionlistener(){
    setSize(400, 500);
    setVisible(true);
    setLayout(new FlowLayout());
    add(b1);
    b1.addActionListener(new actionlistener());  
  }
  public static void main(String[] args) {
    new actionlistener();
  }
}
