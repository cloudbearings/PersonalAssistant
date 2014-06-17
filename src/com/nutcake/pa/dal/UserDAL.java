package com.nutcake.pa.dal;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.nutcake.pa.dal.DB;
import com.nutcake.pa.entity.User;

public class UserDAL {
	public static boolean flag;		
	public static boolean check(User c) throws SQLException{	
	String	name=c.getUname();
	String pwd=c.getPassword();
	String sql="select * from user "+"where uname='"+name+"'"+" and password='"+pwd+"'";
    DB.connect();	
    try{
	   ResultSet rs=DB.st.executeQuery(sql);
	   boolean gotIt=rs.next();
	   if(gotIt){
		 flag=true;	    		 
		  	    }
		  else
		 	flag=false;
	    }
	    catch(SQLException e){
	    	System.out.println(e);
	    }
		DB.disconnect();
		return flag;
	}
	
	public static void update(User c) throws SQLException{
		int id=c.getId();
		String name=c.getUname();
		String pwd=c.getPassword();
		String sql="update user set password='"+pwd+"'where uname='"+name+"' and ID="+id+"";
	    DB.connect();	
		try{
			int resullt=DB.st.executeUpdate(sql);
	       }
		catch(SQLException e){
		System.out.println(e);
	    }
		DB.disconnect();	
	}
	
}
