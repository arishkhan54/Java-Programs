package com.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.entity.Student;
import com.service.Service;

public class Controller {

	void insertData() throws ClassNotFoundException, SQLException {

		Service ss = new Service();
		ss.insertData(3, "Aakash", "1000000", "Java Developer");
	}

	public void updateData() throws ClassNotFoundException, SQLException {

		Service s3 = new Service();
		s3.updateData("Faizan",3);
	}

	public void deleteData() throws ClassNotFoundException, SQLException {

		Service s2 = new Service();
		s2.deleteData(4);
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Service s1 = new Service();
		ArrayList<Student> a1 = s1.std();
		System.out.println(a1);
		Controller cc = new Controller();
//		 cc.updateData();
//		 cc.deleteData();
		 cc.insertData();
	}
}
