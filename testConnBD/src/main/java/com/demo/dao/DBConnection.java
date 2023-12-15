package com.demo.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DBConnection {

	static Connection conn=null;
	
	
	public static Connection getConnection()
	{
		if(conn==null) {
		try {
			
//			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//			String url="jdbc:mysql://192.168.10.150:3306/dac41";
//			conn=DriverManager.getConnection(url,"dac41","Welcome");
//			System.out.println("dude");
			
			Class.forName("com.mysql.jdbc.Driver");
			  
			conn=DriverManager.getConnection("jdbc:mysql://192.168.10.150:3306/dac41","dac41","welcome");  
			
			Statement s=conn.createStatement();
			ResultSet rs=s.executeQuery("select * from student ");
//			System.out.println("dude ");
//			Statement st=conn.createStatement();
//			ResultSet rs=st.executeQuery("select * from product");
			while (rs.next())
			{
				
				System.out.println("id :"+ rs.getInt(1));
				System.out.println("name :"+rs.getString(2));
				System.out.println("last_name :"+rs.getString(3));
				System.out.println("Date_of_birth :"+rs.getDate(4));
				System.out.println("Emailid :"+rs.getString(5));
				System.out.println();
				System.out.println("+============+===========+============+============+============+============+");
				
			}
//			System.out.println("dude ");
			
		} catch (SQLException  | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
		return conn;
		
	}
	
	public void closeConn()
	{
		if(conn!=null)
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
