package com.Question1;

public interface Y {
	
	abstract void funA();
	default void funB() {
		System.out.println("Fun B Inside interface Y and type is Deafault ");
	}
	static void funC() {
		System.out.println("Fun C Inside interface Y and type is Static ");

	}
}
