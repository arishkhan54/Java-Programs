package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.entity.Student;

public class Dao {

	String path = "jdbc:mysql://localhost:3306/jdbc";
	String uname = "root";
	String upassword = "Arish@123";
	String st1, st2, st3, st4;

	public ArrayList<Student> std() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(path, uname, upassword);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from student");
		ArrayList<Student> al = new ArrayList<Student>();

		while (rs.next()) {

			st1 = rs.getString(1);
			st2 = rs.getString(2);
			st3 = rs.getString(3);
			st4 = rs.getString(4);
			Student ss = new Student();
			// System.out.println(st1 + " " + st2 + " " + st3 + " " + st4);
			ss.setId(st1);
			ss.setName(st2);
			ss.setSalary(st3);
			ss.setDesignation(st4);
			al.add(ss);
		}
		return al;

	}

	public String insertData(int id, String name, String salary, String designation)
			throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(path, uname, upassword);
		String sql = "INSERT INTO student VALUES(?,?,?,?)";

		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, salary);
		ps.setString(4, designation);
		int insert = ps.executeUpdate();

		System.out.println(insert);

		return "Data saved successfully";

	}

	public void deleteData(int id) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(path, uname, upassword);
		String sql = "DELETE FROM student  WHERE id = ?";

		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		int delete = ps.executeUpdate();

		System.out.println(delete);

	}

	public void updateData(String name,int id) throws ClassNotFoundException, SQLException {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection conn = DriverManager.getConnection(path, uname, upassword);
	    
	    // Use placeholders in the SQL statement
	    String sql = "UPDATE student SET name = ? WHERE id = ?";
	    
	    try (PreparedStatement ps = conn.prepareStatement(sql)) {
	        // Set the parameters
	        ps.setString(1, name); // Set name for the first placeholder
	        ps.setInt(2, id);       // Assuming you want to update the record with id 4

	        // Execute the update
	        int update = ps.executeUpdate();
	        System.out.println("Rows affected: " + update);
	    } finally {
	        // Close the connection
	        if (conn != null && !conn.isClosed()) {
	            conn.close();
	        }
	    }
	}
}
