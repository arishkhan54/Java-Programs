//The StringBuffer Class is mutable in Nature it will Change After the Conversion of String 
package com.java;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Welcome ");
		System.out.println("Orignal String is : "+sb);
		System.out.println("After using append() method the String wil be Changed ");
		System.out.println("Now the String is changed to : "+sb.append("To the Office"));
		System.out.println(sb.reverse());
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.charAt(5));
		System.out.println(sb.indexOf("e"));
		System.out.println(sb.length());
		System.out.println(sb.isEmpty());
	}
}
