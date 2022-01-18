/*=========
Osita Nduka
Lab 12
Cist 2372
4/23/2016
==========*/

import java.util.*;
//import javax.swing.*;
//import java.awt.*;
//import java.io.File;
//import java.awt.Color;
//import java.sql.*;
//import java.net.*;
import java.rmi.*;
import java.rmi.Registry.*;



public interface M  extends Remote{
	
	public String getMessage() throws RemoteException;


}//end class