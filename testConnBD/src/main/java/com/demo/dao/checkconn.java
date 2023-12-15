package com.demo.dao;

import java.sql.Connection;

public class checkconn {

	public static void main(String[] args) {
		try {
			Connection con=DBConnection.getConnection();
//			System.out.println("hello");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
