package com.jss.me_trying_to_learn_jee.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstStep {
 
	 public static void main(String[] args) {
		
		 
		 //step -1  Register Driver
		 
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//step -2
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/self_learn","root","Millionaire$1M");
			
			
			
			//step -3 create statement
			
			Statement st = connection.createStatement();
			
			
			//step - 4 execute query 
			String inself = "insert into selflearnig values(12,'Prashu',21,553787898)";
			st.execute(inself);
			
			//step - 5
			
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}
}
