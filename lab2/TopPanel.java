/*=========
Osita Nduka
Lab 2
Csit 2372
1/20/2016
==========*/

//import java.awt.Color;
import javax.swing.*;
import java.awt.*;

class TopPanel extends JPanel {

	JLabel fl;

	TopPanel(){

		fl = new JLabel("Student information");
		fl.setForeground(Color.BLUE);
		add(fl);

	}//end constructer


/*public static void main(String[] args) {

	TopPanel fa = new TopPanel();
	JFrame a = new JFrame();

	a.setLayout(new FlowLayout());	
	a.add(fa);
	a.setSize(500,500);
	a.setLocation(300,300);
	a.setVisible(true);
	a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
}//end main
*/



}//end Class