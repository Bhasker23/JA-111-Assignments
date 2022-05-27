package com.Question2;

public class Main {

	
	    public static void main(String[] args) {
	        Animal a = new Animal();
	        Sheep t5 = (Sheep) new  Goat();
	    
	        a.eat();
	        t5.eat();
	        
//	        Java compiler will give class cast exception.
	        
	}
}
