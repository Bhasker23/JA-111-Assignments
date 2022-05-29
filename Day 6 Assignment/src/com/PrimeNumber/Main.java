package com.PrimeNumber;


public class Main {

	
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		
		int[] arr = new int[inputArray.length];
		
		int k = 0;
		
		for (int i = 0; i < inputArray.length; i++) {
			
			int count = 0;
			
			for (int j = 1; j <= inputArray[i] ; j++) {
				
				if (inputArray[i] % j == 0) {
					count++;
				}
			}
			
			if (count == 2) {
			
				arr[k++] = inputArray[i];
			}

		}

		return arr;
	}
	
	public static void main(String[] args) {
		
		Main m = new Main();
		
		int [] arr = {10,12,5,50,11,14,15};
			
		int[] prime =  m.findAndReturnPrimeNumbers(arr);
		 
		for (int i = 0; i < prime.length; i++) {
			if (prime[0] == 0) {
					System.out.println("Prime number not found in the supplied Array");
				break;
		}
			else if (prime[i] != 0) {
				System.out.println(prime[i]);
			}
			else{
				break;
			}
	}
		 
		
	}
}
