package com.java;

public class Array3 {

	public static void main(String[] args) {
		
		int a[][]={{1,2,3},{2,4,5},{4,4,5}};
		int b[][]={{1,2,3},{2,4,5},{4,4,5}};
		int z[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				z[i][j]=a[i][j]+b[i][j];
				System.out.println(z[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
