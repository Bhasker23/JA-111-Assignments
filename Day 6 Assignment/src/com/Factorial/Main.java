package com.Factorial;

public class Main {

	public static void main(String[] args) {
		
		if (args.length == 1) {
			
			int fact = 1;
			int x = Integer.parseInt(args[0]);
			for (int i = 1; i <= x ; i++) {
				fact = fact * i;
			}
			System.out.println(fact);
		}
		if (args.length == 2) {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int z = Math.abs(x-y);

			int fact = 1;
			for (int i = 1; i <= z ; i++) {
				fact = fact * i;
			}
			System.out.println(fact);
		}
		if (args.length > 2) {
			System.out.println("Error");
		}
	}
}
