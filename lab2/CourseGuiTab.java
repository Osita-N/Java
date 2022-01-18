/*=========
Osita Nduka
Lab 2
Csit 2372
1/20/2016
==========*/


import javax.swing.*;
import java.awt.*;

class CourseGuiTab extends JFrame{

		JTabbedPane jtp = new JTabbedPane();

		JPanel only = new JPanel();
		JPanel next = new JPanel();

		JLabel label = new JLabel("Hello World");
		
	CourseGuiTab(){

		TopPanel tp = new TopPanel();
		MiddlePanel mp = new MiddlePanel();
		ButtomPanel bp = new ButtomPanel();

		jtp.add("Student GUI",only);
		jtp.add("Hello World",next);
		add(jtp);

		only.setLayout(new BorderLayout());
		only.add(tp, BorderLayout.NORTH);
		only.add(mp, BorderLayout.CENTER);
		only.add(bp, BorderLayout.SOUTH);
		
		next.add(label);

		setSize(500,300);
		setLocation(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

	}//end constucter 

	public static void main(String[] args) {
		
		CourseGuiTab cgt = new CourseGuiTab();

    }//end main
} //end Class