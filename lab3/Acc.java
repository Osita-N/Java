/*=========
Osita Nduka
Lab 3
Cist 2372
1/27/2016
==========*/

//import java.awt.Color;
import javax.swing.*;
import java.awt.*;

public class Acc {

	String name; 
	int accNo;
	float bal;
	

	public Acc(){

		name = "";
		accNo = 0;
		bal = 0f;

	}//end c1

	public Acc(String n, int ac, float b){

		name = n;
		accNo = ac;
		bal = b;

	}//end c2
	
	public float deposit (float a){

		bal = bal + a;
		return bal;

	}

	public float withdraw (float a){	

			bal = bal - a;
			return bal;

	}


	//Set & get

	public void setName(String n){name = n;}
	public String getName(){return name;}

	public void setAccNo(int ac){accNo = ac;}
	public int getAccNo(){return accNo;}

	public void setBal(float b){bal = b;}
	public float setBal(){return bal;}

	public void display(){

		System.out.println("this is your name:  "+name);
		System.out.println("this is your AccNo#:  "+accNo);
		System.out.println("this is your balance:  "+bal);

	}//end display



	public static void main(String[] x) {

		Acc a1 = new Acc("Frank",2222,500.00f);
		a1.deposit(100.00f);
		a1.withdraw(900.00f);
		a1.display();
		

	}//end Main

}//End Class