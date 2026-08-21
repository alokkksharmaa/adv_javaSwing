import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class event extends JFrame implements MouseListener{
  
  JLabel l1 = new JLabel("Mouse Testing");

  event(){
    setSize(400, 500);
    setVisible(true);
    setLayout(new FlowLayout());
    add(l1);
    addMouseListener(this);
  }

  public void mouseClicked(MouseEvent e){
    l1.setText("Mouse Clicked");
  }

  public void mousePressed(MouseEvent e){
    l1.setText("Mouse Pressed");
  }

  public void mouseReleased(MouseEvent e){
    l1.setText("Mouse Released");
  }

  public void mouseEntered(MouseEvent e){
    l1.setText("Mouse Entered");
  }

  public void mouseExited(MouseEvent e){
    l1.setText("Mouse Exited");
  }

  public static void main(String[] args) {
    new event();
  }
}
