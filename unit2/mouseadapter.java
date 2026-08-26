import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// mouse adapter class is used to handle mouse events. It provides empty implementations of 
// all the methods in the MouseListener interface, allowing you to override only the methods you need.
public class mouseadapter extends JFrame {
  
  JLabel l1 = new JLabel("Mouse Click Testing");


  mouseadapter(){
    setSize(400, 500);
    setVisible(true);
    setLayout(new FlowLayout());
    add(l1);
    addMouseListener(new MouseAdapter(){
      public void mouseClicked(MouseEvent e) 
      {
        l1.setText("Mouse Clicked!");
      }
    });
  }
  public static void main(String[] args) {
    new mouseadapter();
  }
}
