package com.Set;

import java.util.*;
public class LinkedHashSet1 {

	 public static void main(String args[]){  
		  LinkedHashSet<String> al=new LinkedHashSet<String>();  
		  al.add("Maxgen");  
		  al.add("Arish");  
		  al.add("Ravi");  
		  al.add("Umer");  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  

}
