package com.java;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		int arr[] = new int[4];
		arr[0]=101;
		arr[1]=201;
		arr[2]=301;
		arr[3]=401;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			}
		try {
			
			arr[4]=501;			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block will be Executed");
		}
	}
}
