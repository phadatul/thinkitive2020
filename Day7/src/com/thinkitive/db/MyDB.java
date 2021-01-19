package com.thinkitive.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDB {
	public static void main(String[] args) {

		try {
			// REGISTER DRIVER CLASS
			Class.forName("com.mysql.jdbc.Driver");

			// CREATE AND ESTABLISH CONNECTION
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

			// STATEMENT
			Statement st = con.createStatement();
			// EXECUTE QUERY
			st.execute("insert into think_emp values(9,'asd')");
			ResultSet rs=st.executeQuery("select * from think_emp");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString("name"));
			}
			// CLOSE CONNECTON
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
