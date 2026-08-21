import javax.swing.*;
import java.awt.*;
// design a student form from using GridBagLayout

public class lpu  extends JFrame{

  JLabel l1 = new JLabel("Student");
  JLabel l2 = new JLabel("Name");
  JLabel l3 = new JLabel("Roll");

  JTextField tf1 = new JTextField(15);
  JTextField tf2 = new JTextField(15);
  
  JButton b1 = new JButton("Save");

  lpu(){
    setSize(500, 400);
    setVisible(true);
    setLayout(new GridBagLayout());
    // gridbag constraints = it a class 
    GridBagConstraints gbc = new GridBagConstraints();

    // defining aligmnent
    gbc.gridx = 0;     //column no;
    gbc.gridy = 0;     // row number
    gbc.gridwidth = 2; //occupies 2 columns
    // gbc.gridheight = 5; //occupies 5 rows

    // to specify in centre
    gbc.anchor = GridBagConstraints.CENTER;


    add(l1,gbc);

    
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.gridwidth = 1;
    gbc.anchor = GridBagConstraints.WEST;
    add(l2,gbc);


    gbc.gridx = 1; 
    gbc.gridy = 1;
    
    add(tf1,gbc);


    gbc.gridx = 0;     //column no;
    gbc.gridy = 2;
    add(l3,gbc);

  
    gbc.gridx = 1;     //column no;
    gbc.gridy = 2;
    add(tf2,gbc);
    
    gbc.gridx = 1;     //column no;
    gbc.gridy = 3;
    gbc.anchor  = GridBagConstraints.CENTER;
    add(b1,gbc);
  }

  public static void main(String[] arg){
    new lpu();
  }
}
