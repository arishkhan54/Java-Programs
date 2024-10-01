package com.java;

public abstract class AbstractClass {

		float l,b,rect;
		float p,r,circle;
		
		public abstract void gun();
		//The method in which Before the method Type if ("abstract")keyword is there this method is called 
		//as abstract method.

		public void fun() {

			p=3.14f;
			r=3f;
			circle=p*r*r;
			System.out.println("Area of Circle is "+circle);

		}
		public static void main(String[] args) {
			
			Test01 t1 = new Test01();
			t1.gun();
			t1.fun();

		}

	}

	class Test01 extends AbstractClass {

		@Override
		public void gun() {

			l=10f;
			b=20f;
			rect=l*b;
			System.out.println("The Area Of Rectangle is "+rect);
		}

	}


