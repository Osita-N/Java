/*=========
Osita Nduka
Lab 10
Csit 2372
4/20/2016
==========*/

import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.*;
import java.awt.*;

class CourseGui extends JFrame implements ActionListener {

	TopPanel tp = new TopPanel();
	MiddlePanel mp = new MiddlePanel();
	ButtomPanel bp = new ButtomPanel();
 
	int id;
	Student f = new Student();

	CourseGui(){

		this.setLayout(new BorderLayout());
		this.add(tp, BorderLayout.NORTH);
		this.add(mp, BorderLayout.CENTER);
		this.add(bp, BorderLayout.SOUTH);	
		this.setSize(500,300);
		this.setLocation(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	//setbutton
	bp.a.addActionListener(this);
	bp.c.addActionListener(this);
	bp.d.addActionListener(this);
	bp.b.addActionListener(this);

	}//end constucter
		public void actionPerformed(ActionEvent ae){

			//select
			if(ae.getSource() == bp.a){

					int id = Integer.parseInt(mp.f5.getText());
					
					f.selectDB(id);
					mp.f1.setText(f.getfir());
					mp.f2.setText(f.getlname());
					mp.f3.setText(f.getEm());
					mp.f4.setText(f.getGp()+" ");
					f.display();

			}//end listener

			//update
			if(ae.getSource() == bp.c){

				f.setfir(mp.f1.getText());
				f.setlname(mp.f2.getText());
				f.setEm(mp.f3.getText());
				f.setGp(Float.parseFloat(mp.f4.getText()));
				f.updateDB();
			}//end 

			//delete
			if(ae.getSource() == bp.d){

				f.deleteDB();
				
			}//end

			//insert
			if(ae.getSource() == bp.b){

				Student f2 = new Student();

				f2.insertDB(Integer.parseInt(mp.f5.getText()),
											 mp.f1.getText(),
											 mp.f2.getText(),"547 peach way","Dallas","Ga",9955,
											 mp.f3.getText(),
											 Float.parseFloat(mp.f4.getText()));
				
			}//end 

		}//end listner

	public static void main(String[] args) {

		CourseGui cg = new CourseGui();

    }//end main
} //end Class