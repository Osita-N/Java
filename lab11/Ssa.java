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

public class Ssa {

	public Ssa(){

		try{

			Socket s1;
			ServerSocket ss1 = new ServerSocket(8000);

			System.out.println("Server Ready.......");

			s1 = ss1.accept();

			//input br = new BufferedReader(new StreamReader(s1.getInputStream()));

			InputStream is;	
			is = s1.getInputStream();

			DataInputStream dis;
			dis = new DataInputStream(is);



			for(int a = 0 ; a <= 4 ; a++){

				int myarr = dis.readInt();

				System.out.println(myarr);	

			}

			
			
		
			//DataInputStreamReader sr;
			//sr = new InputStreamReader(is);

		 	//BufferedReader br;
			//br = new BufferedReader(sr);
			//String s;
			/*
			for(int a = 0 ; a <= 4 ; a++){

				int myarr = dis.readInt();	
				
				System.out.println(myarr);

			while(nextin == true){

				sr = br.readLine();
				System.out.println(s);

			}*/
			//output
			//OutPutStream os;
			//os = os.getOutPutStream();
		}
		catch(Exception e){

			System.out.println(e);
		}
	}//end Method

	public static void main(String[] args) {
	
		Ssa ssa = new Ssa();

	}//end main

}//end class