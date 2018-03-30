package com.itforall.ams.connection;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class CreateConnection {
	 public static Connection con;
	 static String propFileName = "jdbc.properties";
	 InputStream file = getClass().getClassLoader().getResourceAsStream(propFileName);
		
	
public Connection getConnection(){
	Properties p=new Properties();
	try {
		p.load(file);
	}
	catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	String driverName=p.getProperty("driver_name");
	String url=p.getProperty("url");
	String userName=p.getProperty("username");
	String password=p.getProperty("password");
	try {
		Class.forName(driverName);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		con=DriverManager.getConnection(url,userName,password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}
public static void closeConnection(){
	try{
		con.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
