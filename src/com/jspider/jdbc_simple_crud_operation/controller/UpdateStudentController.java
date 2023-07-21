package com.jspider.jdbc_simple_crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateStudentController {
	Connection connection = null;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id ");
		int id = sc.nextInt();
		
		System.out.println("Enter new email to update");
		String email = sc.next();
		
		//step-1 Load/Register The Driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			
			//step-2 Create Connection
			
			String url = "jdbc:mysql://localhost:3306/jdbc-10am";
			String user = "root";
			String pass="Millionaire$1M";
			
			Connection connection = DriverManager.getConnection(url, user, pass);
			
			//step-3 Create Statement
			
			Statement statement = connection.createStatement();
			
			//Step-4 execute query
			
			String updateStudentEmailQuery = "update student set email='"+email+"' Where idstudent ="+id;
			
			int a = statement.executeUpdate(updateStudentEmailQuery);
			if(a==1) {
				System.out.println("Data is updated");
				
			}else {
				System.out.println("Selected id is not present");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
