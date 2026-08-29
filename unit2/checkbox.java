import javax.swing.*;
import java.awt.*;
// AWT = abstract window toolkit
import java.awt.event.*;
// WAP to elustrate the use of JcheckBox and JCheckBoxMenuItem.

public class checkbox  extends JFrame implements ItemListener{

  JRadioButton b1 = new JRadioButton("Male");
  JRadioButton b2 = new JRadioButton("Female");
  
  JLabel l1 = new JLabel(" ");

  JCheckBox jc = new JCheckBox("Java");
  JCheckBox jc1 = new JCheckBox("C++");
  JCheckBox jc2 = new JCheckBox("Python");

  checkbox(){
    setSize(500, 400);
    setVisible(true);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // I'll put b1 and b2 in a group
    ButtonGroup bg = new ButtonGroup();
    bg.add(b1);
    bg.add(b2);
    add(b1); add(b2);

    b1.addItemListener(this);
    b2.addItemListener(this);



    add(jc);
    add(jc1);
    add(jc2);
    add(l1);
    jc.addItemListener(this);
    jc1.addItemListener(this);
    jc2.addItemListener(this);
  }

  @Override
  public void itemStateChanged(ItemEvent e){
    if(b1.isSelected()){
      l1.setText("Gender : Male");
    }else if(b2.isSelected()){
      l1.setText("Gender : Female");
    }

    String str= "Selected: ";
    if(jc.isSelected()){
      str = str + "Java";
    }else if(jc1.isSelected()){
      str = str +  "C++";
    }else if(jc2.isSelected()){
      str = str +  "Python";
    }
    jc.setText(str);
  }



  public static void main(String[] args) {
    new checkbox();
  }
}
