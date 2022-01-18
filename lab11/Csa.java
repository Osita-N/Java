/*=========
Osita Nduka
Lab 11
Cist 2372
4/13/2016
==========*/

import java.util.*;
//import javax.swing.*;
//import java.awt.*;
import java.io.*;
//import java.io.File;
//import java.awt.Color;
import java.sql.*;
import java.net.*;

public class Csa {


	public Csa(int myArr[]){



		try{

			Socket s1;	 
			s1 = new Socket("Localhost",8000);
	
			//output ps = new PrintStream(s1.getOutPutStream());

			OutputStream os;
			os = s1.getOutputStream();

			DataOutputStream dout;
			dout = new DataOutputStream(os);

			for(int a = 0 ; a <= 4 ; a++){

				dout.writeInt(myArr[a]);	

			}

			//input
			//InputStream is;
			//is = s1.getInputStream();
		 
		}
		catch(Exception e){

			System.out.println(e);
		}

	}//end Method

	public static void main(String[] args) {

		int myArr[] = {1,2,3,4,5};

		Csa csa = new Csa(myArr);
			
	}//end main

}//end class