package com.java;

import java.util.Scanner;

public class Calculator {
	  
	Scanner sc=new Scanner(System.in);
	int a,b,add,mul,sub,div,cal;
	public void Get() {
		
		System.out.println("Enter The Pin What You Have to Calculate : \n*****************************************************************************");
		System.out.println("Example : (Addition=1) or (Mutiplication=2) or (Substraction=3) and (Division=4)");
		cal=sc.nextInt();
		System.out.println("Enter a First Number :");
		a=sc.nextInt();
		System.out.println("Enter the Second Number :");
		b=sc.nextInt();
		add=a+b;
		mul=a*b;
		sub=a-b;
		div=a/b;
	}
	void Put() {
		
		if(cal == 1) {
			System.out.println("Addition of Number is "+add);
		}
		if(cal == 2) {
			System.out.println("Multilpication of Two Number is "+mul);
				
		}
		if(cal == 3) {
			System.out.println("Substraction of Two Number is "+sub);
				
		}
		if(cal == 4) {
			System.out.println("Division of Two Number is "+div);
			
		}
	}
	public static void main(String args[]) {
		
		Calculator c1=new Calculator();
		c1.Get();
		c1.Put();
	}
}
