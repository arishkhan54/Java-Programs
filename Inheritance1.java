//Single Level Inheritance

package com.java;

class A{
	
	void input() {
		
		System.out.println("Class A Called...");
	}
}
class B extends A{
	
	void get() {
	
		System.out.println("Class B Called...");
	}
}
public class Inheritance1 {
	
	public static void main(String[] args) {
		
		B b=new B();
		b.input();
		b.get();
	}
}
