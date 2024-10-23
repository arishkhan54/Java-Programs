package com.Set;

import java.util.*;
public class LinkedHashSet2 {

	public static void main(String argvs[])  
	{  
	  
	// Creating an empty LinekdhashSet of string type  
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();  
	  
	// Adding elements to the above Set  
	// by invoking the add() method  
	lhs.add(".Net");  
	lhs.add("Python");  
	lhs.add("C");  
	lhs.add("C++");  
	lhs.add("Php");  
	  
	// displaying all the elements on the console  
	System.out.println("The hash set is: " + lhs);  
	  
	// Removing an element from the above linked Set  
	  
	// since the element "Good" is present, therefore, the method remove()  
	// returns true  
	System.out.println(lhs.remove("Php"));  
	lhs.addFirst("Java");
	lhs.addLast("HTML");
	Object lan = lhs.clone();
	// After removing the element  
	System.out.println("After removing the element, the hash set is: " + lhs);  
	  
	// since the element "For" is not present, therefore, the method remove()  
	// returns false  
	System.out.println(lhs.remove("C++"));  
	System.out.println("The hash set is: " + lhs);  
	System.out.println("The hash set of Object lan :"+lan);
	
	}  
}
