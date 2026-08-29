import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jcombobox extends JFrame implements ItemListener {

  // JComboBox<String> c1 = new JComboBox<>();  
  JComboBox<String> c1 = new JComboBox<>();
  JLabel l1 = new JLabel("Selected Item is: ");

  jcombobox(){
    setSize(500, 400);
    setVisible(true);
    setLayout(new FlowLayout());
    c1.addItem("java");
    c1.addItem("C++");
    c1.addItem("JavaScript");
    c1.addItem("Python");
    add(c1); add(l1);
    c1.addItemListener(this);
  }

  @Override
  public void itemStateChanged(ItemEvent e){
    String str = (String)c1.getSelectedItem();
    l1.setText("Selected Item is" + str);
  }

  public static void main(String[] args) {
    new jcombobox();
  }
}