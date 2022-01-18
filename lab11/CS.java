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

public class CS {


	public CS(){

		try{

			Socket s1;
		 
			s1 = new Socket("Localhost",8000);
	
			//output ps = new PrintStream(s1.getOutPutStream());
			OutputStream os;

			os = s1.getOutputStream();

			PrintStream ps;
			ps = new PrintStream(os); 

			ps.println("Hello World");

			//input
			//InputStream is;
			//is = s1.getInputStream();
		 
		}
		catch(Exception e){

			System.out.println(e);
		}

	}//end Method

	public static void main(String[] args) {

		CS cs = new CS();
			
	}//end main

}//end class