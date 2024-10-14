package com.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(101);
		al.add(102);
		al.add(103);
		al.add(104);
		
		for (Integer ak : al) {

			System.out.println(ak);
		}

	}
}
