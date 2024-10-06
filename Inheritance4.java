//Hierarchical Inheritance

package com.java;

class Information {
	
	String game="Cricket";
	String player="Virat "+"Kohli";
}
class Sports extends Information{
	
	void put() {
		
		System.out.println("Favorite Game : "+game);
	}
}
class Player extends Information{
	
	void output() {
		
		System.out.println("Favorite Player : "+player);
	}
}
public class Inheritance4 {

	public static void main(String[] args) {
	
		Sports sp=new Sports();
		sp.put();
		Player p=new Player();
		p.output();
	}
}
