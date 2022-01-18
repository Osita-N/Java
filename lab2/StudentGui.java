/*=========
Osita Nduka
Lab 2
Csit 2372
1/20/2016
==========*/


import javax.swing.*;
import java.awt.*;

class StudentGui extends JFrame {

		

	StudentGui(){

		
		TopPanel tp = new TopPanel();
		MiddlePanel mp = new MiddlePanel();
		ButtomPanel bp = new ButtomPanel();

		this.setLayout(null);
		tp.setBounds(0,25,600,25);
		add(tp);
		mp.setBounds(175,75,225,200);
		add(mp);
		bp.setBounds(0,300,600,50);	
		add(bp);
		this.setSize(600,400);
		this.setLocation(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	

	}//end constucter 

	public static void main(String[] args) {

		StudentGui sg = new StudentGui();

    }//end main
} //end Class