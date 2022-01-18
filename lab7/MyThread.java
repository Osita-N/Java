/*=========
Osita Nduka
Lab 7
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

public class MyThread implements Runnable {

		String name;

		public MyThread(String o){

			name = o;

		}//end method

		public void run(){

			try{

				for (int i = 0;i<=100; i++ ) {	
				
					System.out.println("Thread  "+ name);

				}

			}//end Try
			catch(Exception e){

					System.out.println("get help \n"+e);

			}//end catch
			
		}//end method

		public static void main(String[] args) {

			Thread t1 = new Thread(new MyThread("one"));
			Thread t2 = new Thread(new MyThread("Two"));

			t1.start();
			t2.start();
			
		}//end main

}//end Class
