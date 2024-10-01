package com.java;

class CovariantReternType {
	int id=8;
	CovariantReternType get() {return this;}
	
	void message() {
		System.out.println("The Id of Employee is "+id);
	}

}
class Variant extends CovariantReternType{
	Variant get() {return this;}
	
	void message() {
		System.out.println("Welcome to Covariant Return Type");
	}
	public static void main(String[] args) {
		new Variant().get().message();
		new CovariantReternType().get().message();
	}
}
