package com.countryDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BusStandDao {

	String dri = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/batch197";
	String user = "root";
	String pass = "root";
	
	public void insertData() throws Exception {
		Class.forName(dri);
		Connection c = DriverManager.getConnection(url,user,pass);
		PreparedStatement ps = c.prepareStatement("insert into busstand values (?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, 1);
		ps.setString(2, "Sunil Devidas Role");
		ps.setString(3, "sunilrole34@gmail.com");
		ps.setString(4, "Latur");
		Date date = Date.valueOf("2025-03-04");
		ps.setDate(5, date);
		ps.setString(6, "Male");
		ps.setString(7, "Tambarwadi");
		ps.setString(8, "India");
		ps.setString(10, "Sunil@123");
		ps.setInt(9, 413522);
		ps.setString(11, "Sunil@123");
		ps.setString(12, "sunilrole");
		ps.executeUpdate();
		System.out.println("Data inserted....");
		c.close();
	}
	
	public void deleteData() throws Exception {
		Class.forName(dri);
		Connection c = DriverManager.getConnection(url,user,pass);
		PreparedStatement ps = c.prepareStatement("delete from busstand where sr = ?;");
		ps.setInt(1, 1);
		ps.executeUpdate();
		System.out.println("Data deleted...");
		c.close();
	}
	
	public void updateData() throws Exception {
		Class.forName(dri);
		Connection c = DriverManager.getConnection(url,user,pass);
		PreparedStatement ps = c.prepareStatement("update busstand SET password=?, Confirm_Password=? where emailaddress = ? ");
		ps.setString(3, "sunilrole34@gmail.com");
		ps.setString(2, "Sunil@!12");
		ps.setString(1, "Sunil@!12");
		ps.executeUpdate();
		System.out.println("Data updated...");
		c.close();
	}
	
	public void fetchData() throws Exception{
		Class.forName(dri);
		Connection c = DriverManager.getConnection(url,user,pass);
		PreparedStatement ps = c.prepareStatement("select * from busstand");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getDate(5)+" | "+rs.getString(6)+" | "+rs.getString(7)+" | "+rs.getString(8)+" | "+rs.getInt(9)+" | "+rs.getString(10)+" | "+rs.getString(11)+" | "+rs.getString(12));
		}
	}
}
