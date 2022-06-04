package com.Question1;

public class ZImpl implements Z {

	@Override
	public void fun1() {
	System.out.println("Fun1 inside ZImpl but from Interface X and type is Abstract ");
		
	}

	@Override
	public void funA() {
		
		System.out.println("FunA inside ZImpl but from Interface Y and type is Abstract ");
	
	}

	@Override
	public void fun4() {
		
		System.out.println("Fun4 inside ZImpl but from Interface Z and type is Abstract ");

	}

	@Override
	public void fun2() {
		System.out.println("Fun2 inside ZImpl but from Interface X and type is Default ");
	}
		
	public static void main(String[] args) {
		ZImpl zImpl = new ZImpl();
		
		zImpl.fun1();
		zImpl.fun2();
		X.fun3();
		zImpl.funA();
		zImpl.funB();
		Y.funC();
		zImpl.fun4();
		}
	}




