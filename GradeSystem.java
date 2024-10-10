package com.java;

import java.util.Scanner;

public class GradeSystem {
	public static void main(String[] args) {
		
		System.out.println("Enter the Percentage:");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if (marks <= 35) {
			System.out.println("Fail");
		}
		else if (marks >=35 && marks<=50) {
			System.out.println("C Grade");
		}
		else if (marks>50 && marks<=60) {
			System.out.println("B Grade");
		}
		else if (marks>60 && marks<=70) {
			System.out.println("B+ Grade");
		}
		else if (marks>70 && marks<=80) {
			System.out.println("A Grade");
		}
		else if (marks>80 && marks<=90) {
			System.out.println("A+");
		}
		else {
			System.out.println("O Grade");
		}
		
	}

}
