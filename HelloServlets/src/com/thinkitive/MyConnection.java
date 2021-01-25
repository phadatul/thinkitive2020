package com.thinkitive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * This is my DB connection class whic provides Stattement and
 * PreparedStatement.
 * @author aadish
 *
 */
public class MyConnection {
	Connection con;
	Statement st;
	PreparedStatement ps;

	public MyConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getDbConnection() {

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;

	}

	public void closeConnection() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public Statement getStatement() {
		try {
			st = this.getDbConnection().createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}
	
	public PreparedStatement getPreparedStatement(String sql) {
		try {
			ps = this.getDbConnection().prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ps;
	}

}
