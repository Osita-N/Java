/*=========
Osita Nduka
Lab 4
Cist 2372
1/27/2015
==========*/

//import java.awt.Color;
import javax.swing.*;
import java.awt.*;

public class TestException{

	public static void main(String[] args) {

		try{


			int myArr[] = new int[10];

			int x,y,z;

			x=0;
			y=10;
			z=y/x;

			/*myArr[0] = 1;
			myArr[1] = 1;
			myArr[2] = 1;
			myArr[3] = 1;
			myArr[4] = 1;
			myArr[5]= 1;
			myArr[6] = 1;
			myArr[7] = 1;
			myArr[8] = 1;
			myArr[9] = 1;*/

			myArr[10] = 1;

			System.out.print(myArr[11]);
		}//end try
		catch(Exception e){

			System.out.println("NO! No! no!");

		}//end catch
		
	}//End main

}//End Class