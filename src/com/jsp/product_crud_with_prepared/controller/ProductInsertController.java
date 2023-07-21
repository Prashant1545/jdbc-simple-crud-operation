package com.jsp.product_crud_with_prepared.controller;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 
 * @author Prashant SHukla.
 */
public class ProductInsertController {

	
	public static void main(String[] args) {

		Connection connection=null;
		try {

			
			// step-1 load/register driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/preparedstatement";
			String user = "root";
			String pass = "Millionaire$1M";

		    connection = DriverManager.getConnection(url, user, pass);

			String insertQuery = "insert into products values(?,?,?,?)";
			// step-3 create statement
			PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
			
			preparedStatement.setInt(1, 106);
			preparedStatement.setString(2, "Mobile");
			preparedStatement.setDouble(3, 150000);
			preparedStatement.setString(4, "white");
			
			preparedStatement.execute();
			
			System.out.println("Data---stored");	

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
}
