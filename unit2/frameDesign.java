import javax.swing.*;

// WAP a programme to design a frame
// it must be a child

public class frameDesign extends JFrame {
  
  JLabel l1 = new JLabel("Name");
  JLabel l2 = new JLabel("Email");

  JTextField tf1 = new JTextField("write your name here");
  JTextField tf2 = new JTextField("write your email here");

  JButton b1 = new JButton("Save");

  frameDesign(){
    setSize(500, 400);  //compulsory, 
    setVisible(true);   //optional
    setTitle("Student Application form");
    setLocation(600, 600);
    // setLayout(new flowLayout());
    setLayout(null);
  };

  public static void main(String args[]){
   new frameDesign(); 
  }
}