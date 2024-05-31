package com.prepare;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.json.JSONArray;
import org.json.JSONObject;


import com.mysql.cj.jdbc.Driver;


public class Students extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		JSONObject  responseObj = new JSONObject ();
		
		JSONArray StudentsList = new JSONArray();
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("failed to register to driver");
		}
		
		 String url = "jdbc:mysql://localhost:3306/jdbcpractice";
		 String userName = "root";
		 String password = "hasan8006";
		 String query = "select * from Demo";
		try(Connection con = DriverManager.getConnection(url,userName,password)) {
			if(con != null) {
				System.out.println("connected to database");
			}
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(query);
			while(rs.next()) {
				JSONObject obj = new JSONObject();
				obj.put("id", rs.getString(1));
				obj.put("ename", rs.getString(2));
				obj.put("age", rs.getString(3));
				StudentsList.put(obj);
			}
			responseObj.put("students", StudentsList);
			responseObj.put("status","success");
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			responseObj.put("status","failure");
		}
		
		
		
		
		response.getWriter().println(responseObj);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSONObject responseObject = new JSONObject();
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("failed to register to driver");
		}
		
		 String url = "jdbc:mysql://localhost:3306/jdbcpractice";
		 String userName = "root";
		 String password = "hasan8006";
		 String query = "select * from Demo";
		 String InsertQuery = "insert into Demo('id','ename','age') values(?,?,?);";
		
		
		try(Connection con = DriverManager.getConnection(url,userName,password)) {
			if(con != null) {
				System.out.println("DB connection success");
			}
			PreparedStatement stmt = con.prepareStatement(InsertQuery);
			stmt.setString(1,"id" );
			stmt.setString(2,"ename" );
			stmt.setString(3,"age" );
			
			int rows = stmt.executeUpdate();
			if(rows == 1)
				responseObject.put("status", "success");
			else
				responseObject.put("status", "failed");
			
			responseObject.put("status", "success");
			
			
	}catch(Exception e) {
		System.out.println(e);
		responseObject.put("status", "Failed");
	}
response.getWriter().print( responseObject);
}
}