package bll;

import java.sql.SQLException;
import dal.UserDAL;
import entity.User;

public class UserBLL {		
	public static boolean check(User c) throws SQLException{		
		UserDAL.check(c);		
		return UserDAL.flag;		
	}
	
	public static void update(User c) throws SQLException{
		UserDAL.update(c);
	}
}
