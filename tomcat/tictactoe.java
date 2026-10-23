import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 class tictactoe extends JFrame implements ActionListener
 {
	 JPanel p1=new JPanel();
	 JButton b[][]=new JButton[3][3];
	 int ctr=1;
	 tictactoe()
	 {
		 setSize(500,400);
		 setVisible(true);
		 setLayout(new FlowLayout());
		 p1.setLayout(new GridLayout(3,3));
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 b[i][j]=new JButton();
				 b[i][j].addActionListener(this);
				 p1.add(b[i][j]);
			}
		 }
		 add(p1);
	 }
	 public void actionPerformed(ActionEvent e)
	 {
		 JButton clickedbutton=(JButton)e.getSource();
		 if(!clickedbutton.getText().equals(""))
		 {
			 return;
		 }
		 if(ctr%2==0)
		 {
			 clickedbutton.setText("0");
			 ctr++;
		 }
		 else
		 {
			 clickedbutton.setText("X");
			 ctr++;
		 }
	 }

	 public static void main(String arg[])
	 {
		new tictactoe();
	 }
}

