package com.Set;

import java.util.*;
public class HashSet1 {
	 public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		  HashSet<String> set=new HashSet<String>();  
		  set.add("Irfan");  
		  set.add("Arish");  
		  set.add("Kaif");  
		  set.add("Faizan");
		  set.isEmpty();
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }
}
