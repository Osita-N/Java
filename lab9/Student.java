/*=========
Osita Nduka
Lab 9
Cist 2372
3/23/2016
==========*/

import java.util.*;
//import javax.swing.*;
//import java.awt.*;
import java.io.*;
//import java.io.File;
//import java.awt.Color;
import java.sql.*;

public class Student {

		//globe ver
		int sId;
		String firstName;
		String lastName;
		String street;
		String city;
		String state;
		int zip;
		String email;
		float gpa;

	//emty con
	public Student(){

		sId = 0;
		firstName = "";
		lastName = "";
		street = "";
		city = "";
		state = "";
		zip = 0;
		email = "";
		gpa = 0.0f;

	}//end emty con

	//con
	public Student(int sId1,String firstName1,String lastName1,String street1,String city1,String state1,int zip1,String email1,float gpa1){


		sId = sId1;
		firstName = firstName1;
		lastName = lastName1;
		street = street1;
		city = city1;
		state = state1;
		zip = zip1;
		email = email1;
		gpa = gpa1;

	}//end con

	//sql = select
	public void selectDB(int sId1){

		sId = sId1;

		try{
				//sun.jdbc.odbc.JdbcOdbcDriver
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("Driver Loaded");

				//jdbc:odbc:JavaDB
			Connection c1 = DriverManager.getConnection("jdbc:odbc:JavaDB");
			System.out.println("Database connected");

			Statement stmt = c1.createStatement();

			String sql = "select * from students where Id = "+sId;

			ResultSet rs;
			rs = stmt.executeQuery(sql);
	

			while(rs.next()){

				
				sId = rs.getInt(1);
				firstName = rs.getString(2);
				lastName = rs.getString(3);
				street = rs.getString(4);
				city = rs.getString(5);
				state = rs.getString(6);
				zip = rs.getInt(7);
				email = rs.getString(8);
				gpa = rs.getFloat(9);
			}

			c1.close();


		}catch(Exception e){

			System.out.println("get help 1" +e);

		}//end catch
		
	}//end

	//sql = insert
	public void insertDB(int sId1,String firstName1,String lastName1,String street1,String city1,String state1,int zip1,String email1,float gpa1){

		sId = sId1;
		firstName = firstName1;
		lastName = lastName1;
		street = street1;
		city = city1;
		state = state1;
		zip = zip1;
		email = email1;
		gpa = gpa1;

		try{
				//sun.jdbc.odbc.JdbcOdbcDriver
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("Driver Loaded");

				//jdbc:odbc:JavaDB
			Connection c1 = DriverManager.getConnection("jdbc:odbc:JavaDB");
			System.out.println("Database connected");

			Statement stmt = c1.createStatement();

			String sql = "insert into Students values("+sId+",'"+firstName+"','"+lastName+"','"+street+"','"+city+"','"+state +"',"+zip+",'"+ email+"',"+gpa+")";
			System.out.println(sql);
			
			int n;
			n = stmt.executeUpdate(sql);
	
			if (n == 1) 
				System.out.println("Insert Succeded!!");
			else
			    System.out.println("Insert Falied!!");

			c1.close();


		}catch(Exception e){

			System.out.println("get help 2" +e);

		}//end catch
		
	}//end

	//sql = Delete
	public void deleteDB( ){
	 
		try{
				//sun.jdbc.odbc.JdbcOdbcDriver
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("Driver Loaded");

				//jdbc:odbc:JavaDB
			Connection c1 = DriverManager.getConnection("jdbc:odbc:JavaDB");
			System.out.println("Database connected");

			Statement stmt = c1.createStatement();

			String sql = "Delete from Students where ID="+sId;
			System.out.println(sql);
			int n;
			n = stmt.executeUpdate(sql);
	
			if (n == 1) 
				System.out.println("Delete Succeded!!");
			else
			    System.out.println("Delete Falied!!");

			c1.close();

		}catch(Exception e){

			System.out.println("get help 3" +e);

		}//end catch
		
	}//end

	//sql = update
	public void updateDB(){

		try{
				//sun.jdbc.odbc.JdbcOdbcDriver
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("Driver Loaded");

				//jdbc:odbc:JavaDB
			Connection c1 = DriverManager.getConnection("jdbc:odbc:JavaDB");
			System.out.println("Database connected");

			Statement stmt = c1.createStatement();

			String sql = "update Students set Firstname='"+firstName+"',"+
											  "lastName='"+lastName+"',"+
											  "Street='"+street+"',"+
											  "city='"+city+"',"+
											  "state='"+state+"',"+ 
											  "zip="+zip+","+
											  "email='"+email+"',"+
											  "gpa="+gpa+" "+
											  "where ID="+sId;
			System.out.println(sql);
			int n;
			n = stmt.executeUpdate(sql);
	
			if (n == 1) 
				System.out.println("update Succeded!!");
			else
			    System.out.println("update Falied!!");

			c1.close();


		}catch(Exception e){

			System.out.println("get help 4" +e);

		}//end catch
		
	}//end

	//Sets

	public void setSid(int sId1){sId = sId1;}
	public void setfir(String firstName1){firstName = firstName1;}
	public void setlname(String lastName1){lastName = lastName1;}
	public void setStr(String street1){street = street1;}
	public void setCi(String city1){city = city1;}
	public void setSta(String state1){state = state1;}
	public void setZi(int zip1){zip = zip1;}
	public void setEm(String email1){email = email1;}
	public void setGp(float gpa1){gpa = gpa1;}

	//Gets

	public int getSid(){return sId;}
	public String getfir(){return firstName; }
	public String getlname(){return lastName;}
	public String getStr(){return street;}
	public String getCi(){return city;}
	public String getSta(){return state;}
	public int getZi(){return zip;}
	public String getEm(){return email;}
	public float getGp(){return gpa;}

	public void display(){

		//System.out.println(id.g+"/t"+stu.getString(2)+"/t"+ln.getString(3)+"/t"+str.getString(4)+"/t"+ci.getString(5)+"/t"+st.getString(6)+"/t"+zi.getString(7)+"/t"+em.getString(8)+"/t"+gp.getString(9));
		System.out.println(sId);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(street);
		System.out.println(city);
		System.out.println(state);
		System.out.println(zip);
		System.out.println(email);
		System.out.println(gpa);

	}//end display


	public static void main(String[] args) {
		
		//Student s1 = new Student(4,"Frank","Jones","123 Main","Atlanta","GA", 30133,"fj@yahoo.com", 3.2f);
		//s1.display();


		/*
		Student  s1 = new Student();

		s1.selectDB(4);     //accessing DB
		s1.display();          //displays all data from DB for student with id=4
		*/
		
		//Student s2 = new Student();

		//s2.insertDB(44, "Frank", "Mayes", "123 Main street", "Atlanta", "GA", 30100,"fmayes@yahoo.com",3.3f);
		//s2.display();
		

		/*Student s4 = new Student();
		s4.selectDB(44); 
		s4.deleteDB();*/

		/*Student s5 = new Student ();
		s5.selectDB(33);
		s5.setZi(30106);
		s5.updateDB();*/


	}//end main


}//end class