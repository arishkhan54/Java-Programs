package com.Map;

import java.util.LinkedHashMap;
import java.util.Map;

class Student{
	
	int id;
	String name;
	String add;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
}
public class LinkedHashMap2 {

	public static void main(String[] args) {
		
		Map<Integer, Student> m2 = new LinkedHashMap<Integer,Student>();
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("Arish");
		s1.setAdd("Jalgaon");
		
		Student s2 = new Student();
		s2.setId(201);
		s2.setName("Faizan");
		s2.setAdd("Jalgaon");
		
		Student s3 = new Student();
		s3.setId(301);
		s3.setName("Lekhan");
		s3.setAdd("Bhusawal");
		
		Student s4 = new Student();
		s4.setId(401);
		s4.setName("Aves");
		s4.setAdd("Erandol");
		
		m2.put(1, s1);
		m2.put(2, s2);
		m2.put(3, s3);
		m2.put(4, s4);
		
		for (Map.Entry<Integer, Student> ee : m2.entrySet()) {
			Integer key = ee.getKey();
			Student value = ee.getValue();
			System.out.print("Key :"+key+"\t");
			System.out.println(value.id+" "+value.name+" "+value.add);
		}		
	}
}
