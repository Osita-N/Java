/*=========
Osita Nduka
Lab 12
Cist 2372
4/23/2016
==========*/

import java.util.*;
//import javax.swing.*;
//import java.awt.*;
//import java.io.*;
//import java.io.File;
//import java.awt.Color;
//import java.sql.*;
//import java.net.*;
import java.rmi.*;
import java.rmi.Registry.*;

public class Cm{

	private Registry r;
	private Message m;
	private String s;
	
	public Cm(){

		try{

			r = LocateRegistry.getRegistry("localHost",800)
			m = reg.lookup("Osita");
			s = m.getmessage();

			System.out.println(s);
		}
		catch(Exception e){

			System.out.println(e);

		}//end catch

	}//end con

	public static void main(String[] args) {
		
		Cm c = new Cm();

	}//end main

}//end class