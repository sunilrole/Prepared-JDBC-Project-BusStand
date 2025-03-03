package com.testtka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedBusStand {

	String cl = "com.mysql.cj.jdbc.Driver";
	String con = "jdbc:mysql://localhost:3306/batch197";
	String user = "root";
	String pass = "root";

	void insertData() throws Exception {
		Class.forName(cl);
		Connection c = DriverManager.getConnection(con, user, pass);
		PreparedStatement p = c.prepareStatement("insert into busstand values (?,?,?,?);");
		p.setInt(1, 4);
		p.setString(2, "Aurad");
		p.setInt(3, 311);
		p.setString(4, "Latur");
		p.executeUpdate();
		System.out.println("Data inserted...");
		c.close();

	}

	void updateData() throws Exception {
		Class.forName(cl);
		Connection c = DriverManager.getConnection(con, user, pass);
		PreparedStatement p = c.prepareStatement("update busstand SET standName=?, standCode=?, city=?  where sr=?;");
		p.setInt(4, 4);
		p.setString(1, "Aurad Shahjani");
		p.setInt(2, 311);
		p.setString(3, "Latur");
		p.executeUpdate();
		System.out.println("Data updated...");
		c.close();
	}

	void deleteData() throws Exception {
		Class.forName(cl);
		Connection c = DriverManager.getConnection(con, user, pass);
		PreparedStatement p = c.prepareStatement("delete from busstand where sr=?;");
		p.setInt(1, 4);
		p.executeUpdate();
		System.out.println("Data deleted...");
		c.close();
	}

	void fetchData() {
		try {
			Class.forName(cl);
			Connection c = DriverManager.getConnection(con, user, pass);
			PreparedStatement p = c.prepareStatement("select * from busstand;");
			ResultSet rs = p.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getInt(3)+" | "+rs.getString(4));
			}
			c.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws Exception {

		PreparedBusStand ps = new PreparedBusStand();
//		ps.insertData();
//		ps.updateData();
//		ps.deleteData();
		ps.fetchData();

	}

}
