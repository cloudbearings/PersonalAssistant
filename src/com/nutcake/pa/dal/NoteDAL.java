package com.nutcake.pa.dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.nutcake.pa.entity.Noter;



public class NoteDAL {
	
	public static Noter add(Noter c)throws SQLException{		
		Date dt=c.getDatetime();
		String st=c.getSort();
		String cap=c.getCaption();
		String re=c.getRemarks();
		String sql="insert into note(datetime,sort,caption,remarks)"+"values('" + dt + "','"+st+"','"+cap+"','"+re+"')";
		DB.connect();
		try{
			int result=DB.st.executeUpdate(sql);
		}catch(SQLException e){
			System.out.println(e);
		}
		DB.disconnect();
		return c;
	}
	public static void update(Noter c)throws SQLException{
		int i=c.getId();
		Date dt=c.getDatetime();
		String st=c.getSort();
		String cap=c.getCaption();
		String re=c.getRemarks();
		String sql="update note set datetime='"+dt+"',"+"sort='"+st+"',"+"caption='"+cap+"',"+"remarks='"+re+"'"+"where ID='"+i+"'";
		 DB.connect();
		try{
			int result=DB.st.executeUpdate(sql);
		}
		catch(SQLException e){
		 System.out.println(e);	
		}
		DB.disconnect();
	}
	public static void findbysort(String sort)throws SQLException{			
		String sql="select * from note where sort='"+sort+"'";
		DB.connect();
		try{
			ResultSet rs=DB.st.executeQuery(sql);
		}
		catch(SQLException e){
			 System.out.println(e);
		}
		DB.disconnect();
	}
	public static void findbydate(Date c)throws SQLException{	
		String sql="select * from note where datetime='"+c+"'";
		DB.connect();
		try{
			ResultSet rs=DB.st.executeQuery(sql);
		}
		catch(SQLException e){
			 System.out.println(e);
		}
		DB.disconnect();	
	}
	
}
