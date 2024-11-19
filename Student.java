package com.entity;

public class Student {

	String id;
	String name;
	String salary;
	String designation;

	public String getId() {
		return id;
	}

	public void setId(String st1) {
		this.id = st1; 
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Student [Id=" + id + ", Name=" + name + ", Salary=" + salary + ", Designation=" + designation + "]";
	}

}
