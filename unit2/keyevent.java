import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class keyevent extends JFrame implements KeyListener{

  JLabel l1 = new JLabel("Key Testing");
  TextField t1 = new TextField(20);

  keyevent(){
    setSize(400, 500);
    setVisible(true);
    setLayout(new FlowLayout());
    add(l1);
    add(t1);
    addKeyListener(this);

  }


  // WAP to convert anything your'e typing into uppercase and display it in the textfield. Use keyPressed() method to do this.

  // public void keyTyped(KeyEvent e){
  //   t1.setText("Key Typed");
  // }

  public void keyPressed(KeyEvent e){
    t1.setText("Key Pressed");
  }

  public void keyReleased(KeyEvent e){
    t1.setText("Key Released");
  }

  public void keyTyped(KeyEvent e){
    t1.setText("Key Typed: " + e.getKeyChar());
  }
  public static void main(String[] args) {
    new keyevent();
  }

}
