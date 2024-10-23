package com.Map;

import java.util.*;

class HashMap1{  
	 
	public static void main(String args[]){  
	   
		Map<Integer,String> hm=new HashMap<Integer,String>();    
	    
			System.out.println("Initial list of elements: "+hm);  
			hm.put(101,"Arish");    
			hm.put(102,"Saif");    
			hm.put(103,"Kaif");   
	       
			System.out.println("After invoking put() method ");  
			
			for(Map.Entry m:hm.entrySet()){    
				System.out.println(m.getKey()+" "+m.getValue());    
				}  
	        
			hm.putIfAbsent(104, "Saad");  
			System.out.println("After invoking putIfAbsent() method ");  
			
			for(Map.Entry m:hm.entrySet()){    
				System.out.println(m.getKey()+" "+m.getValue());    
				}  
			
			Map<Integer,String> map=new HashMap<Integer,String>();  
			map.put(105	,"Lekhan");  
			map.putAll(hm);  
			System.out.println("After invoking putAll() method ");  
			
			for(Map.Entry m:map.entrySet()){    
				System.out.println(m.getKey()+" "+m.getValue());    
	          	}  
	 	}  
}  