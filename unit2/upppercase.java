import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// WAP to convert anything your'e typing into uppercase and display it in the textfield. Use keyPressed() method to do this.

public class upppercase extends Frame implements KeyListener {

  JLabel l1 =  new JLabel("Key Testing");
  TextField t1 = new TextField(20);

  upppercase(){
    setSize(400, 500);
    setVisible(true);
    setLayout(new FlowLayout());
    add(l1);
    add(t1);
    addKeyListener(this);
  }

  public void keyPressed(KeyEvent e){
    t1.setText("Key Pressed");
  }

  public void keyReleased(KeyEvent e){
    t1.setText("Key Released");
  }

  public void keyTyped(KeyEvent e){
    t1.setText("Key Typed: " + Character.toUpperCase(e.getKeyChar()));
  }

  public static void main(String[] args) {
    new upppercase();
  }

}



// wap to do the mouseclick event to 