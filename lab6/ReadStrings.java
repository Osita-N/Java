/*=========
Osita Nduka
Lab 6
Cist 2372
2/22/2016
==========*/

import java.util.*;
//import javax.swing.*;
//import java.awt.*;
import java.io.*;
//import java.lang.*;
//import java.io.File;
//import java.awt.Color;

public class ReadStrings{

	
		//boolean w1,r1;
		//long size;
		//Formatter f1;
		//private Scanner r;
		File f1;

		ReadStrings(String i, String a){

			try{

				f1 = new File(i) ;

				FileinputStream fs = new FileinputStream(f1);
				PrintStream ps = new PrintStream(fs);

				String s = ps.readInt();	

				//f1.exists();
				//f1.canWrite();

				System.out.println(f1.exists()+"\n"+f1.canWrite()+"\n"+f1.length()+s);

				

				ps.close();

			}//end Try
			catch(Exception e){

					System.out.println("get help \n"+e);

			}//end catch
			
		}//end method

		public static void main(String[] args) {

			ReadStrings rs = new ReadStrings("WriteInts.txt","Hello World");
			
		}//end main

}//end Class