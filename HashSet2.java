package com.Set;

import java.util.*;
public class HashSet2 {
	public static void main(String args[]){  
		  HashSet<String> set=new HashSet<String>();  
		           set.add("Aakash");  
		           set.add("Saad");  
		           set.add("Affan");  
		           set.add("Faizan");  
		           System.out.println("An initial list of elements: "+set);  
		           //Removing specific element from HashSet  
		           set.remove("Saad");  
		           System.out.println("After invoking remove(object) method: "+set);  
		           HashSet<String> set1=new HashSet<String>();  
		           set1.add("Umer");  
		           set1.add("Kaif");  
		           set.addAll(set1);  
		           System.out.println("Updated List: "+set);  
		           //Removing all the new elements from HashSet  
		           set.removeAll(set1);  
		           System.out.println("After invoking removeAll() method: "+set);  
		           //Removing elements on the basis of specified condition  
		           set.removeIf(str->str.contains("Vijay"));    
		           System.out.println("After invoking removeIf() method: "+set);  
		           //Removing all the elements available in the set  
		           set.clear();  
		           System.out.println("After invoking clear() method: "+set); 
		           set.spliterator();
		 }  
}
