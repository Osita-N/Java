/*=========
Osita Nduka
Lab 1
Cist 2372
1/20/2015
==========*/


import javax.swing.*;
import java.awt.*;

class CourseGui extends JFrame {

		

	CourseGui(){

		TopPanel tp = new TopPanel();
		MiddlePanel mp = new MiddlePanel();
		ButtomPanel bp = new ButtomPanel();

		this.setLayout(new BorderLayout());
		this.add(tp, BorderLayout.NORTH);
		this.add(mp, BorderLayout.CENTER);
		this.add(bp, BorderLayout.SOUTH);	
		this.setSize(500,300);
		this.setLocation(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	

	}//end constucter 

	public static void main(String[] args) {

		CourseGui cg = new CourseGui();

    }//end main
} //end Class