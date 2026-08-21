import javax.swing.*;
import java.awt.FlowLayout;
// awt == abstaract window toolkit
import java.awt.event.*;

public class designframe2 extends JFrame implements ActionListener {
  JLabel l1 = new JLabel("Enter the 1st number");
  JLabel l2 = new JLabel("Enter the 2nd number");
  JLabel l3 = new JLabel("Result");

  JTextField tf1 = new JTextField(10);
  JTextField tf2 = new JTextField(10);
  JTextField tf3 = new JTextField(10);
  
  JButton b1 = new JButton("Click here");

  designframe2(){
    setSize(600, 400);
    setVisible(true);
    setLayout(new FlowLayout());
    add(l1);add(tf1);add(l2);add(tf2);add(b1);add(l3);add(tf3);
    b1.addActionListener(null);
  }

  public void actionPerformed(ActionEvent e)
  {
    String s1 = tf1.getText();
    String s2 = tf2.getText();
    int a = Integer.parseInt(s1);    
    int b = Integer.parseInt(s2);

    int add = a + b;
    tf3.setText(String.valueOf(add));
  }

  public static void main(String args[]){
    new designframe2();    
  }
}