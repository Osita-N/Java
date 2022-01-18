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

public class MyThreads extends Thread {

		int num;

		public MyThreads(int mt){

			num=mt;

			for (int n=0; n<=mt; n++ ) {
				
				System.out.println("Thread Running   " +num);
			}

		}//end method

		



		
		public static void main(String[] args) {

			MyThreads mt = new MyThreads(100);
			MyThreads mt2 = new MyThreads(215);
			MyThreads mt3 = new MyThreads(204);
			MyThreads mt4 = new MyThreads(165);

			mt.start();
			mt2.start();
			mt3.start();
			mt4.start();

		}//end main

}//end Class