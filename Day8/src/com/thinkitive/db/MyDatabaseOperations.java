package com.thinkitive.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDatabaseOperations {

	MyConnection db = new MyConnection();
	Statement st;
	PreparedStatement ps;

	public void insertEmp(int id, String name) {

		try {
			ps = db.getPreparedStatement("insert into think_emp values(?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.execute();

			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteEmp(int id) {

		try {
			ps = db.getPreparedStatement("delete from think_emp where id=?");
			ps.setInt(1, id);
			ps.execute();
			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateEmp(int id, String name) {

		try {
			ps = db.getPreparedStatement("update think_emp set name=? where id=?");
			ps.setString(1, name);
			ps.setInt(2, id);
			ps.execute();
			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void displayEmp() {
		st = db.getStatement();

		try {
			ResultSet rs = st.executeQuery("select * from think_emp");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}

			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
