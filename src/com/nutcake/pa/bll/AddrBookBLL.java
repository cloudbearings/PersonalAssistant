package com.nutcake.pa.bll;

import java.sql.SQLException;
import java.util.Date;

import com.nutcake.pa.dal.AddrBookDAL;
import com.nutcake.pa.entity.AddrBooker;


public class AddrBookBLL {
	public static void  add(AddrBooker c)throws SQLException{		
		AddrBookDAL.add(c);
	}
	public static void update(AddrBooker c)throws SQLException{
		AddrBookDAL.update(c);
	}
	public static void findbyname(String c)throws SQLException{	
		AddrBookDAL.findbyname(c);
	}
	public static void findbyphone(String c)throws SQLException{	
		AddrBookDAL.findbyphone(c);
	}
	public static void findbytype(String c)throws SQLException{	
		AddrBookDAL.findbytype(c);
	}
	
}
