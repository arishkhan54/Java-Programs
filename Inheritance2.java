//Multi-level Inheritance

package com.java;

class Info{
	
	void get() {
		
		System.out.println("Class Info Called...");
	}
}
class Detail extends Info{
	
	void input() {
		System.out.println("Class Detail Called...");
	}
}
class C extends Detail{
	
	void show() {
		System.out.println("Class C Called...");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
	
		C c=new C();
		c.get();
		c.input();
		c.show();
	}
}
