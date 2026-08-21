import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class findCircleArea extends Frame implements ActionListener{

  JLabel l1 = new JLabel("Enter Radius");
  JTextField tf1 = new JTextField(15);

  JButton b1 = new JButton("Area");


  findCircleArea(){
    setSize(500, 400);
    setVisible(true);
    setLayout(new FlowLayout());
    add(l1); add(tf1);add(b1);
    b1.addActionListener(this);

  }

  public void actionPerformed(ActionEvent e){
    int r = Integer.parseInt(tf1.getText());
    double area = 3.14 *  r * r;
    JOptionPane.showMessageDialog(this, area);
  }
  public static void main(String[] args) {
    new findCircleArea();
  }
}