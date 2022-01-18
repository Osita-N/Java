/*=========
Osita Nduka
Lab 8
Cist 2372
3/16/2016
==========*/

import java.util.*;
//import javax.swing.*;
//import java.awt.*;
import java.io.*;
//import java.io.File;
//import java.awt.Color;
import java.sql.*;

public class DBTester {

	public static void main(String[] args) {
		
		try{
				//sun.jdbc.odbc.JdbcOdbcDriver
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("Driver Loaded");

				//jdbc:odbc:JavaDB
			Connection connection = DriverManager.getConnection("jdbc:odbc:JavaDB");
			System.out.println("Database connected");

			Statement Statement = connection.createStatement();

			ResultSet resultSet = Statement.executeQuery("Select * from InstRUCTORs");

			while(resultSet.next()){

				System.out.println(resultSet.getString(1)+"/t"+resultSet.getString(2)+"/t"+resultSet.getString(3));

			}

			connection.close();


		}catch(Exception e){

			System.out.println("get help 1" +e);

		}//end catch
	}
	
}//end of class