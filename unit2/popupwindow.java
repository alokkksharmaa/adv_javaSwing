import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class popupwindow extends JFrame implements ActionListener {
  
  JLabel l1  = new JLabel("Popup window Testing");
  JButton b1 = new JButton("popup was successful");
  popupwindow(){
    setSize(400, 500);
    setVisible(true);
    setLayout(new FlowLayout());
    add(l1);
    add(b1);
    b1.addActionListener(this);    
  }

  // public void actionPerformed(ActionEvent e){
  //   JOptionPane.showMessageDialog(null, "Popup window was successful");
  // }
  // showMessageDialog

  public void actionPerformed(ActionEvent e){
    JOptionPane.showConfirmDialog(null, "Popup window was successful");
  }
  
  public static void main(String[] args) {
    new popupwindow();
  }
}
