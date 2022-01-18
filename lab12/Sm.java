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
import java.rmi.Server.*;

public class Sm extends UnicastRemoteObject implements M{

	private Registry r;

	public Sm(){

		try{

			r = LocateRegistry.getRegistry(800);
			r.rebind("osita",this);

			System.out.println("Ready.......");
		}
		catch(Exception e){

			System.out.println(e);

		}//end catch

	}//end con

	public String getM()throws RemoteException{

		return "It works";
	}

	public static void main(String[] args) {
		
		Sm S = new Sm();
		
	}//end main
	
}//end class