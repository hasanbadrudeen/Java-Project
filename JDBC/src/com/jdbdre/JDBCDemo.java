package com.jdbdre;
import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub\
//		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jdbcpractice";
		String username = "root";
		String password = "hasan8006";
		String query = "select * from Demo";
		
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		System.out.println("Id is " + rs.getInt(1));
		System.out.println("name is " + rs.getString(2));
		System.out.println("age is " + rs.getInt(3));
		
		con.close();
	}

}
