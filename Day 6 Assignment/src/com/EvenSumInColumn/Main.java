package com.EvenSumInColumn;

public class Main {
public static void main(String[] args) {
	
	int[][] matrix = {
			{1,2,3},
			{4,5,6},
			{7,8,9},
			};
	
		
		for (int c = 0; c < matrix.length; c++) {
			int sum = 0;
			for (int r = 0; r < matrix[c].length; r++) {
				if (matrix[r][c]%2 == 0) {
					sum += matrix[r][c];
				}
			}
				System.out.println(sum);
		}
	}
}
