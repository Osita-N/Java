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

public class WriteInts{

	
		//boolean w1,r1;
		//long size;
		//Formatter f1;
		//private Scanner r;
		File f1;

		WriteInts(String i,int myArr[]){

			try{

				f1 = new File(i);

				FileOutputStream fout = new FileOutputStream(f1);
				DataOutputStream dout = new DataOutputStream(fout);

				for(int a = 0 ; a <= 4 ; a++){

				dout.writeInt(myArr[a]);	

				}


				f1.exists();
				f1.canWrite();

				System.out.println(f1.exists()+"\n"+f1.canWrite()+"\n"+f1.length());

				

				dout.close();
				
			}//end Try
			catch(Exception e){

					System.out.println("get help \n"+e);

			}//end catch
			
		}//end method

		public static void main(String[] args) {

			int myArr[] = {16, 31, 90, 45, 89};

			WriteInts wi = new WriteInts("WriteInts.txt",myArr);
			
		}//end main

}//end Class