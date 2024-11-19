package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.Dao;
import com.entity.Student;

public class Service {

	public ArrayList<Student> std() throws ClassNotFoundException, SQLException {

		Dao d1 = new Dao();
		ArrayList<Student> dd = d1.std();
		return dd;

	}

	public void insertData(int id, String name, String salary, String designation)
			throws ClassNotFoundException, SQLException {

		Dao dd = new Dao();
		dd.insertData(id, name, salary, designation);
	}


	public void deleteData(int id) throws ClassNotFoundException, SQLException {

		Dao d = new Dao();
		d.deleteData(id);
	}

	public void updateData(String name, int id) throws ClassNotFoundException, SQLException {
		
		Dao d2 = new Dao();
		d2.updateData(name,id);

	}

}
