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
//import java.io.File;
//import java.awt.Color;

public class FileDetails{

	
		boolean w1,r1;
		long size;
		File f1;
	

		FileDetails(String fn){

			try{

				System.out.println(fn);
				f1 = new File(fn);

				w1 = f1.canWrite();
				r1 = f1.canRead();
				size = f1.length();
				f1.exists();

				System.out.println("Can write is:"+w1);
				System.out.println("Can read is:"+r1);
				System.out.println("this much is used:"+size);
				System.out.println("The name is:"+f1.getName());
				System.out.print(f1.exists()+"ly does exists\n");
				//System.out.print(f1.exists()+f1.getName()+size+r1+w1);
				

			}//end Try
			catch(Exception e){

					System.out.print("get help ");

			}//end catch

		}//end method

		public static void main(String[] args) {

			FileDetails fd = new FileDetails("tyler.txt");
			
		}//end main

}//end Class