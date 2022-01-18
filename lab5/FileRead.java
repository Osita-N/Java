/*=========
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

public class FileRead{

	
		//boolean w1,r1;
		//long size;
		//Formatter f1;
		private Scanner r;

		FileRead(){

			try{

				r = new Scanner(new File("C:\\Users\\o4ndu\\Desktop\\Test.txt"));
				
				while (r.hasNext()) {
					
					String a = r.nextLine();
					
					System.out.println(a);


				}

				r.close();

			}//end Try
			catch(Exception e){

					System.out.println("get help \n"+e);

			}//end catch
			
		}//end method

		public static void main(String[] args) {

			FileRead fr = new FileRead();
			
		}//end main

}//end Class