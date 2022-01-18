/*=========
Osita Nduka
Lab 1
Cist 2372
1/20/2015
==========*/


import javax.swing.*;
import java.awt.*;

class MiddlePanel extends JPanel {

	JTextField f1, f2, f3, f4, f5;
	JLabel f1a, f2a,f3a, f4a, f5a;


	MiddlePanel(){

		setLayout(new GridLayout(5,2));

		f5a = new JLabel("ID");
		add(f5a);
		f5 = new JTextField();
		add(f5);

		f1a = new JLabel("First Name:  ");
		add(f1a);
		f1 = new JTextField();
		add(f1);

		f2a = new JLabel("Last Name:  ");
		add(f2a);
		f2 = new JTextField();
		add(f2);
		
		f3a = new JLabel("Email:  ");
		add(f3a);
		f3 = new JTextField();
		add(f3);
		
		f4a = new JLabel("GPA:  ");
		add(f4a);
		f4 = new JTextField();
		add(f4);
		
	}//end constucter

/*public static void main(String[] args) {

	MiddlePanel fa = new MiddlePanel();
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