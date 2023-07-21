package com.jspider.jdbc_simple_crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentController {
    public static void main(String[] args) {
		Connection connection = null;
		
		// step-1 Load/Register Driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step- 2 Create Connection
			
			String url = "jdbc:mysql://localhost:3306/jdbc-10am";
			String user = "root";
			String pass = "Millionaire$1M";
			
			connection = DriverManager.getConnection(url, user, pass);
			
			//step- 3 Create Statement
			
			Statement statement = connection.createStatement();
			
			//step - 4 execute query 
			
			String insertStudentQuery = "insert into student(idstudent,Name,Email,MobileNo) values(420,'Ravi','Ravi420@gmail.com',06757195420)";
		
			
			statement.execute(insertStudentQuery);
			
			System.out.println("++++++++++++++++++Data-----------------Stored+++++++++++++++");
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}finally {
			// step - 5 close connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
