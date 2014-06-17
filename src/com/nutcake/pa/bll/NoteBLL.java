package com.nutcake.pa.bll;

import java.util.Date;
import java.sql.SQLException;

import com.nutcake.pa.dal.NoteDAL;

import com.nutcake.pa.entity.Noter;

public class NoteBLL {
	public static void add(Noter c)throws SQLException{
		NoteDAL.add(c);
	}
	public static void update(Noter c)throws SQLException{
		NoteDAL.update(c);
	}
	public static void findbysort(String c)throws SQLException{	
		NoteDAL.findbysort(c);
	}
	public static void findbydate(Date c)throws SQLException{	
		NoteDAL.findbydate(c);
	}
}
