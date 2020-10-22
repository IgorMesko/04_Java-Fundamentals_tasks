		//  Сформировать квадратную матрицу по заданному образцу
		//  1 2 3 ... n-2 n-1 n 
		//	2 3 4 ... n-1  n  0 
		//  3 4 5 ... n    0  0 
		//	..	..	..	..	.
		// 	n-1	n 0  ... 0 0 0 
package by.htp.home.matrix;

public class TaskEight {

	public static void main(String[] args) {
		
		int n = 6;
		int m = 6;
		int[][] array = initArray(n, m);
		
		printArray(array);
	}

	public static int[][] initArray(int n, int m) {
		int[][] array = new int[n][m];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - i; j++) {
				if(i + j > n) {
					array[i][j] = 0;
				} else {
					array[i][j] = i + j + 1;
				}
			}
		}
		return array;
	}

	public static void printArray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.printf("%-3d", array[i][j]);
			}
			System.out.println("");
		}
	}
}
