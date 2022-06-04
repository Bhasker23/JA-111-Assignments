package com.Question1;

public interface X {
	
	abstract void fun1();
	default void fun2() {
		
	}
	static void fun3() {
		System.out.println("Fun 3 Inside interface X and type is Static ");

	}
	
	
}
