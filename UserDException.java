package com.java;

class VoterException extends ArithmeticException{
	
	public String errorMessage() {
		
		return "Not Eligible For Vote";
	}
}
class VoterId{
	
	void get(String name,int age) {
		
		if(age<18) {
			
			VoterException ve=new VoterException();
			throw ve;
		}
		else {
			
			System.out.println("Person is Eligible for Vote :");
			System.out.println("Name : "+name);
			System.out.println("Age : "+age);
		}
	}
}
class UserDException {

	public static void main(String[] args) {
		
		try {
			
			VoterId vi=new VoterId();
			vi.get("Arish Khan", 20);
		}
		catch (VoterException ve){
		
			System.out.println(ve.errorMessage());
		}
	}
}
