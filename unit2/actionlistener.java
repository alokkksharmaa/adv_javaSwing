import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class actionlistener extends JFrame implements ActionListener {
  JButton b1 = new JButton("Click Me");

  actionlistener(){
    setSize(400, 500);
    setVisible(true);
    setLayout(new FlowLayout());
    add(b1);
    b1.addActionListener(this);  
  }

  public void actionPerformed(ActionEvent e) {
    JOptionPane.showMessageDialog(this, "Button clicked");
  }

  public static void main(String[] args) {
    new actionlistener();
  }
}
