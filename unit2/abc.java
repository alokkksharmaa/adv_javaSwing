//WAp to add two numbers using grid Layout
   import javax.swing.*;
   import java.awt.*;
  //  import java.awt.event.*;
	 // awt == abstaract window toolkit
   class abc extends JFrame
   {
	   JLabel l1=new JLabel("1st Number");
	   JLabel l2=new JLabel("2nd Number");
	   JLabel l3=new JLabel("Result");

	   JTextField tf1=new JTextField(10);
	   JTextField tf2=new JTextField(10);
	   JTextField tf3=new JTextField(10);

	   JButton b1=new JButton("Add");
	   JButton b2=new JButton("Substract");
	   abc()
	   {
		   setSize(500,400);
		   setVisible(true);
		  setLayout(new FlowLayout());
		 	setLayout(new GridLayout(4,2));
		   add(l1);add(tf1);
		   add(l2);add(tf2);
		   add(b1);add(b2);
		   add(l3);add(tf3);
	   }
	   public static void main(String arg[])
	   {
		  new abc();
	   }
   }