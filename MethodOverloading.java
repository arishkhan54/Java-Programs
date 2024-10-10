package com.java;

public class MethodOverloading { 
	 
				static int add(int a,int b){
					return a+b;
				}  
				static int add(int a,int b,int c){
					return a+b+c;
				}  
				public static void main(String[] args){  
					System.out.println(MethodOverloading.add(110,190));  
					System.out.println(MethodOverloading.add(90,200,110));  
				}
		
}  
