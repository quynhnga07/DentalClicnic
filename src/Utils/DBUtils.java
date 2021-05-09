package Utils;

import java.sql.*;
import javax.sql.*;
public class DBUtils
{
	public Connection getConnect() 
	{
		Connection con = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); 
			String url = "jdbc:mysql://localhost:3306/dentalmanagement";
			con = DriverManager.getConnection(url, "root", "1006");
			Statement st = con.createStatement();
			String sql = "Select * from patient"; 
			ResultSet rs = st.executeQuery(sql);
			System.out.println("Done");
			rs.close();
			st.close();
		}
		catch(Exception e)
		{
			System.out.println("Error: "+ e);
		}
		return con;
	}
	/*
	public static void main(String args[])
	{
		DBUtils db = new DBUtils();
		db.getConnect();
	}
	*/
}
