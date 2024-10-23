package com.Map;

import java.util.LinkedHashMap;
import java.util.Map;

class Employee {
	
	int id;
	String name;
	float salary;

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	}

public class LinkedHashMap1 {

		public static void main(String[] args) {

		Map<Integer, Employee> m1 = new LinkedHashMap<Integer, Employee>();
		Employee I1 = new Employee(101, "Amit", 98765.34f);
		Employee I2 = new Employee(201, "Arish", 122030.45f);
		Employee I3 = new Employee(301, "Aakash", 163523.34f);
		Employee I4 = new Employee(401, "Saad", 1200010.43f);

		m1.put(1, I1);
		m1.put(2, I2);
		m1.put(3, I3);
		m1.put(4, I4);

		for (Map.Entry<Integer, Employee> ee : m1.entrySet()) {
			Integer key = ee.getKey();
			Employee value = ee.getValue();
			System.out.println("Key :"+key);
			System.out.println(value.id+" "+value.name+" "+value.salary);
		}

}

}
