import javax.swing.*;
import java.awt.*;
// awt = abstaract window toolkit 

// WAP to use font clas and color class
public class fontAndColor  extends JFrame{
  
  JLabel l1 = new JLabel("Name");
  JTextField tf1 = new JTextField(15);
  JButton b1 = new JButton("Save");

  fontAndColor(){
    setSize(500, 400);
    setVisible(true);
    setLayout(new FlowLayout());
    l1.setBackground(Color.BLACK);
    l1.setForeground(Color.RED);
    tf1.setBackground(Color.BLACK);
    // b1.setBackground(Color.YELLOW);
    Color c = new Color(176, 100, 160);
    b1.setBackground(c);
    b1.setForeground(Color.WHITE);
    add(l1);add(tf1);add(b1);

    Font F = new Font("Blackadder ITC", Font.BOLD, 20);  //Font.ITALIC , Font.BOLD+Font.ITLAIC
    l1.setFont(F);
    b1.setFont(F);
  }
  public static void main(String[] args) {
    new fontAndColor();
  }
}