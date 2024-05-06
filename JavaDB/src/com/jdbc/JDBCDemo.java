package com.jdbc;

import java.sql.*;
public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		readRecords();
//		insertRecords();
//		insertUsingPst();
//		Delete();
//		Update();
//		sp();
//		sp2();
	}
	public static void readRecords() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String password = "hasan8006";
		String query = "select * from employee";
		
		Connection con = DriverManager.getConnection(url,userName,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Id is " + rs.getInt(1));
			System.out.println("Name is " + rs.getString(2));
			System.out.println("Salary is " + rs.getInt(3));
			
		}
		
		con.close();
	}
	
	
	public static void insertRecords() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String password = "hasan8006";
		String query = "insert into employee(4,'priya',250000)";
		
		Connection con = DriverManager.getConnection(url,userName,password);
		Statement st = con.createStatement();
		int rows= st.executeUpdate(query);
		
		System.out.println("No of rows affected :" + rows);
		con.close();
		}
		
	public static void insertUsingPst() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String password = "hasan8006";
		
		int id = 6 ;
		String name = "varun";
		int salary = 300000;
		
		String query = "insert into employee(?,?,?);";
		
		Connection con = DriverManager.getConnection(url,userName,password);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1,id);
		pst.setString(2,name);
		pst.setInt(3,salary);
		int rows = pst.executeUpdate();
		
		
		System.out.println("No of rows affected :" + rows);
		con.close();
		}
	
	
	
	public static void Delete() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String password = "hasan8006";
		
		int id = 5 ; 
		
		String query = "delete from employee where emp_id = " + id ;
		
		Connection con = DriverManager.getConnection(url,userName,password);
		Statement st = con.createStatement();
		int rows= st.executeUpdate(query);
		
		System.out.println("No of rows affected :" + rows);
		con.close();
		}
	
	
	public static void Update() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String password = "hasan8006";
		String query = "update employee set salary = 150000 where emp_id = 1";
		
		Connection con = DriverManager.getConnection(url,userName,password);
		Statement st = con.createStatement();
		int rows= st.executeUpdate(query);
		
		System.out.println("No of rows affected :" + rows);
		con.close();
		}
	
	
	public static void sp() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String password = "hasan8006";
		
		Connection con = DriverManager.getConnection(url,userName,password);
		CallableStatement cst = con.prepareCall("{call GetEmp()}");
		ResultSet rs = cst.executeQuery();
		
		while(rs.next()) {
			System.out.println("Id is " + rs.getInt(1));
			System.out.println("Name is " + rs.getString(2));
			System.out.println("Salary is " + rs.getInt(3));
			
		}
		con.close();
		}
	
	

	public static void sp2() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String password = "hasan8006";

		int id = 3;
		Connection con = DriverManager.getConnection(url,userName,password);
		CallableStatement cst = con.prepareCall("{call GetEmpId(?)}");
		cst.setInt(1,id);
		ResultSet rs = cst.executeQuery();
		
		while(rs.next()) {
			System.out.println("Id is " + rs.getInt(1));
			System.out.println("Name is " + rs.getString(2));
			System.out.println("Salary is " + rs.getInt(3));
			
		}
		con.close();
		}
	
	public static void sp3() throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String password = "hasan8006";

		int id = 3;
		Connection con = DriverManager.getConnection(url,userName,password);
		CallableStatement cst = con.prepareCall("{call GetNameEmpId(?,?)}");
		cst.setInt(1,id);
		cst.registerOutParamater(2, Types.VARCHAR);
		
		cst.executeUpdate();
		System.out.println(cst.getString(2));
		con.close();
		
		
		
		public static void commitdemo() throws Exception{
			String url = "jdbc:mysql://localhost:3306/jdbcdemo";
			String userName = "root";
			String password = "hasan8006";
			
			String query1 = "update employee set salary = 50000 where emp_id = 1";
			String query2 = "update employee set salary = 50000 where emp_id = 2";
			
			Connection con = DriverManager.getConnection(url,userName,password);
			con.setAutoCommit(false);
			
			Statement st = con.createStatement();
			int rows1 = st.executeUpdate(query1);
			System.out.println("Rows affected" + row1);
			
			int rows2 = st.executeUpdate(query2);
			System.out.println("Rows affected" + row2);
			
			if(rows1>0 && rows2>0) {
				con.commit();
			}
			con.close();	
			
			
			public static void batchdemo() throws Exception{
				String url = "jdbc:mysql://localhost:3306/jdbcdemo";
				String userName = "root";
				String password = "hasan8006";
				
				String query1 =" update employee set salary = 400000 where emp_id = 1";
				String query2 =" update employee set salary = 400000 where emp_id = 2";
				String query3 =" update employee set salary = 400000 where emp_id = 3";
				String query4 =" update employee set salary = 400000 where emp_id = 4";
				
				Connection con = DriverManager.getConnection(url,userName,password);
				Statement st = con.createStatement();
				st.addBatch(query1);
				st.addBatch(query2);
				st.addBatch(query3);
				st.addBatch(query4);
				
				int[] res = st.executeBatch();
				
				for(int i : res) {
					System.out.println("Rows affected" + i);
				}
				con.close();
				
				
		}
	
		
	}







