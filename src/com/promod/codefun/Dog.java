package com.promod.codefun;

public class Dog extends Animal{
	
	void eat(){
		
		System.out.println("Dog eats");
	}

	public static void main(String args[]){
		
		Dog d = new Dog();
		Animal a = new Dog();
		a.eat();
		d.eat();
	}
}
