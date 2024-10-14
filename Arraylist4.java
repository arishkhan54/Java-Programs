package com.CollectionFramework;

import java.util.ArrayList;

public class Arraylist4 {

	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Arish");
		s.setRno(8);
		s.setDiv('A');
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s);
		for (Student student : al) {
			System.out.println(student);
		}
	}
}
