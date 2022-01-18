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

public class ReadInts{

	
		//boolean w1,r1;
		//long size;
		//Formatter f1;
		//private Scanner r;
		File f1;

		ReadInts(String i){

			try{

				f1 = new File(i);

				FileInputStream fis = new FileInputStream(i);
				DataInputStream dipt = new DataInputStream(fis);
				
				//while (int c == dipt.read()) {
					
				//}
				//dipt.read();
				//System.out.println(dipt);

				for(int a = 0 ; a <= 4 ; a++){

				int myarr = dipt.readInt();	
				
				System.out.println(myarr);
				}
				

				dipt.close();

			}//end Try
			catch(Exception e){

					System.out.println("get help \n"+e);

			}//end catch
			
		}//end method

		public static void main(String[] args) {

			//int myArr[] = {16, 31, 90, 45, 89};

			ReadInts ri = new ReadInts("WriteInts.txt");
			
		}//end main

}//end Class