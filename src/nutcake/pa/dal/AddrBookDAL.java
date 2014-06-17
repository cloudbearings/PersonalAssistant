package dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;



import entity.AddrBooker;
import entity.Noter;

public class AddrBookDAL {
	public static AddrBooker add(AddrBooker c)throws SQLException{			
		String name=c.getName();
		String sex=c.getSex();		
		 String type=c.getType();
		 String phone=c.getPhone();
		 String email=c.getEmail();
		 String company=c.getCompany();
		 String adress=c.getAdress();		
		String remarks=c.getRemarks();
		String sql="insert into addrbook(name,sex,type,phone,email,company,adress,remarks)";
	    sql=sql+"values('" + name + "','"+sex+"','"+type+"','"+phone+"','" + email + "','"+company+"','"+adress+"','"+remarks+"')";
		DB.connect();
		try{
			int result=DB.st.executeUpdate(sql);
		}catch(SQLException e){
			System.out.println(e);
		}
		DB.disconnect();
		return c;
	} 
	public static void update(AddrBooker c)throws SQLException{
		 String name=c.getName();
		 String sex=c.getSex();		
		 String type=c.getType();
		 String phone=c.getPhone();
		 String email=c.getEmail();
		 String company=c.getCompany();
		 String adress=c.getAdress();		
		 String remarks=c.getRemarks();
		 String sql="update addrbook set sex='"+sex+"',"+"type='"+type+"',"+"phone='"+phone+","+"email='"+email+"',"+"company='"+company+"',"+"adress='"+adress+"',"+"remarks='"+remarks+"'where name='"+name+"'";
		 DB.connect();
		try{
			int result=DB.st.executeUpdate(sql);
		}
		catch(SQLException e){
		 System.out.println(e);	
		}
		DB.disconnect();
	}
	
	public static void findbyname(String name)throws SQLException{			
		String sql="select * from addrbook where name='"+name+"'";
		DB.connect();
		try{
			ResultSet rs=DB.st.executeQuery(sql);
		}
		catch(SQLException e){
			 System.out.println(e);
		}
		DB.disconnect();
	}
	public static void findbytype(String type)throws SQLException{			
		String sql="select * from addrbook where type='"+type+"'";
		DB.connect();
		try{
			ResultSet rs=DB.st.executeQuery(sql);
		}
		catch(SQLException e){
			 System.out.println(e);
		}
		DB.disconnect();
	}
	public static void findbyphone(String s)throws SQLException{	
		String sql="select * from note where phone='"+s+"'";
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
