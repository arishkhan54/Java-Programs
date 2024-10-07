package com.java;

class Animal5{}  
public class InstanceOfOperator extends Animal5 {
	public static void main(String args[]){  
		 Animal5 d=new InstanceOfOperator();  
		 System.out.println(d instanceof Animal5);//true  
		 }
}
