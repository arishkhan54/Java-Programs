package com.java;

public class GetterSetter {

	public static void main(String[] args) {
		
		Encap e= new Encap();
		e.setId(111);
		e.setName("Arish");
		e.setSal(100000f);
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
		
	}
}
