package com.nutcake.pa.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	static String url ="jdbc:odbc:mysource"; 	
	static Connection conn =null;
	static Statement st = null;	
	public static void connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			if (conn == null)
				conn = DriverManager.getConnection(url, "", "");			
			if (st == null)
				st = conn.createStatement();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void disconnect()
	{
		if (st != null)
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if (conn !=null )
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	

	
	

}
