import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class mouselistener extends JFrame implements MouseMotionListener{

  JLabel jl = new JLabel("Welcome");

  mouselistener(){
    setSize(400, 500);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      //to close the window
    add(jl);
    addMouseMotionListener(this);
    setVisible(true);
  }

  public void mouseMoved(MouseEvent e){
    int x = e.getX();
    int y = e.getY();
    jl.setText("mouse Position"  +  "X=" + x + "Y= " +  y);

  }

  public void mouseDragged(MouseEvent e){
  int x = e.getX();
    int y = e.getY();
    jl.setText("mouse Dragged"  +  "X=" + x + "Y= " +  y); 
  }

  public static void main(String[] args) {
    new mouselistener();
  }

} 


