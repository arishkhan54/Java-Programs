package com.java;


public interface InterfaceDemo {

//In the Interface There is no need to Add abstract keyword before method type.
//Because there is by default abstract keyword is there is Interface.	
	
	public void Demo();//example:-public abstract void Demo();

	public void gun();//example:-public abstract void gun();

}

class Fun01 implements InterfaceDemo{
	@Override
	public void gun() {

		System.out.println("The Gun is Shooting Bullets..");
	}

	@Override
	public void Demo() {

		System.out.println("Maxgen Tech...!");
	}

	public static void main(String[] args) {

		System.out.println("The Program For Interface Demo:");
		Fun01 t2 = new Fun01();
		t2.Demo();
		t2.gun();
	}

}
