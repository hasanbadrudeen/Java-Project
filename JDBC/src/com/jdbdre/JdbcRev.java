package com.jdbdre;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRev {
	public static void main(String args[]) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/jdbcpractice";
		String username = "root";
		String password = "hasan8006";
		
//		int id = 8;
//		String name = "Badrudeen";
//		int age = 25;
//		String query = "insert into Demo values(?,?,?);";
		
		
		
//		String query = "select * from Demo";
//		String query = "insert into Demo values(7,'Abdul rahman',50)";
//		int id = 8 ;
//		String query = "delete from Demo where id = " + id ;
		String query = "update Demo set ename = 'Hasan' where ename = 'Hasan badrudeen'";
		
		
		
		
		Connection con = DriverManager.getConnection(url,username,password);
//		PreparedStatement pst = con.prepareStatement(query);
//		pst.setInt(1,id);
//		pst.setString(2,name);
//		pst.setInt(3, age);
//		
//		int row = pst.executeUpdate();
//		System.out.println(row);
		Statement st = con.createStatement();
		int row = st.executeUpdate(query);
		System.out.println(row);
//		while(rs.next())
//		{
//		System.out.println(rs.getInt(1));
//		System.out.println(rs.getString(2));
//		System.out.println(rs.getInt(3));
//		}
		con.close();
	}
}
