/*=========
Osita Nduka
Lab 1
Cist 2372
1/20/2015
==========*/


import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class ButtomPanel extends JPanel {

	JButton a,b,c,d,e;

	ButtomPanel(){

		a = new JButton("Find");
		add(a);
		b = new JButton("Insert");
		add(b);
		c = new JButton("Update");
		add(c);
		d = new JButton("Delete");
		add(d);
		e= new JButton("Exit");
		add(e);

		e.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent x){

				int exit = JOptionPane.showConfirmDialog(null, "Do you want to leave", "Exit", JOptionPane.YES_NO_OPTION);

        		if (exit == JOptionPane.YES_OPTION) {
         		 System.exit(0);
        		}
       			else {
        		}


			}
		});


	}//end constucter


/*public static void main(String[] args) {

	ButtomPanel fa = new ButtomPanel();
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