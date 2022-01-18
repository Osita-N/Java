+/*=========
Osita Nduka
Lab 5
Cist 2372
2/6/2016
==========*/

import java.util.*;
//import javax.swing.*;
//import java.awt.*;
import java.io.*;
//import java.lang.*;
//import java.io.File;
//import java.awt.Color;

public class FileWrite{

	
		//boolean w1,r1;
		//long size;
		Formatter f1;
	

		FileWrite(String fn){

			try{

	

				f1 = new Formatter(fn);

				f1.format("%s %s","hi","326");
				f1.close();
		


			}//end Try
			catch(Exception e){

					System.out.print("get help ");

			}//end catch

		}//end method

		public static void main(String[] args) {

			FileWrite fw = new FileWrite("C:\\Users\\o4ndu\\Desktop\\Test.txt");
			
		}//end main

}//end Class