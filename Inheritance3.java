//Multiple Inheritance does not Support Java But By Using Interface We can Use It..

package com.java;

interface Student{
	
	String name="Arish"+" Khan";
	int rno=111;
}
class Marks{
	
	float per=94.60f;
}
class College extends Marks implements Student{
	
	void Display() {
		
		System.out.println("Name of Student : "+name);
		System.out.println("Roll Number : "+rno);
		System.out.println("Percentage of Student :"+per+"%");
	}
}
public class Inheritance3 {

	public static void main(String[] args) {
		
		College c=new College();
		c.Display();
	}
}
