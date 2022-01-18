/*=========
Osita Nduka
Lab Mp
Cist 2372
4/23/2016
==========*/

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
//import java.io.File;
//import java.awt.Color;
import java.sql.*;
import java.net.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Csa extends JFrame implements Runnable, ActionListener{
 
	JLabel f1;

	JPanel a = new JPanel();
	JPanel b = new JPanel();
	JPanel c = new JPanel();

	JButton s = new JButton("Send");

	JTextField tf;
	JScrollPane sp;
	JTextArea ta;

	private PrintStream ps;
	private String text;
	private BufferedReader br;

	public void Componets(){

		a.setLayout(new GridLayout(1,1));

		ta = new JTextArea();
		a.add(ta);
		sp = new JScrollPane(ta);
		a.add(sp);

		b.setLayout(new GridLayout(2,2));
		f1 = new JLabel("ME:");
		b.add(f1);
		tf = new JTextField();
		b.add(tf);

		c.setLayout(new GridLayout(1,1));
		c.add(s);

	}//end method

	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("in actionPerformed");
		
		if (ae.getSource() == s)
		{
			ta.append("Me:  "+tf.getText()+"\n");
			//System.out.println(ta.getText());
			
			ps.print(tf.getText()+"\n");
			ps.flush();
		}
			
	}//end listener

	public void Frame(){

		Componets();

		this.setLayout(null);
		a.setBounds(75,15,450,150);
		add(a);
		b.setBounds(175,175,275,50);	
		add(b);
		c.setBounds(175,250,75,25);
		add(c);
		this.setTitle("Client Server");
		this.setSize(600,400);
		this.setLocation(400,100);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}//end Method

	public void Socket(){
		try{

			Socket s1;
			s1 = new Socket("Localhost",8000);

			InputStream ips; 
			ips = s1.getInputStream();

			InputStreamReader isr;
			isr = new InputStreamReader(ips);

			br = new BufferedReader(isr);
		
			OutputStream ops;	
			ops = s1.getOutputStream();

			ps = new PrintStream(ops);
		}
		catch(Exception e){

			System.out.println(e);
		}

	}//end socket method

	public void run() 
	{
		try
		{
			//String msgin;
			String text;
			
			while(true)
			{
			System.out.println("Thread is running");
		    text = br.readLine();
			
			ta.append("Guest:  "+text+"\n");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}//end runnable

	public Csa(){

		Frame();
		Socket();

		s.addActionListener(this);

		try
			{
				
				Thread t1 =  new Thread(this);
				t1.start();
			
			}		
			catch (Exception e)
			{
				System.out.println(e);
			}

	}//end con

	public static void main(String[] args) {

		Csa csa = new Csa();
			
	}//end main

}//end class