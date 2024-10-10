package com.java;
	
class MethodOverriding{  
	  
	  void run(int i){
		  System.out.println("Vehicle is running");
		  }
	  public static void main(String args[]){  
			 Bike2 obj = new Bike2(); 
			// MethodOverriding or = new Bike2();
			 obj.run(10);  
			
			 }
}  
	 
class Bike2 extends MethodOverriding{  
	  
	 void run(){
		  System.out.println("Bike is running safely");
		  }  
	    
}  


