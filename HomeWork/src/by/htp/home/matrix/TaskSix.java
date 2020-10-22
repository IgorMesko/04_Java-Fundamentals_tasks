		//  Сформировать квадратную матрицу по заданному образцу
		//  1	1	1	...	1 
		//	1	0	0   ... 1 
		//  1	0	0	...	1 
		//	..	..	..	..	.
		// 	1	1 	1   ... 1 
package by.htp.home.matrix;

public class TaskSix {

	public static void main(String[] args) {
		
		int n = 6;
		int m = 6;
		int[][] array = initArray(n, m);
		
		printArray(array);
	}
	
	public static int[][] initArray(int n, int m) {
		int[][] array = new int[n][m];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(i == 0) {
					array[i][j] = 1;
				}
				if(j == 0) {
					array[i][j] = 1;
				}
				if(j == array.length - 1) {
					array[i][j] = 1;
				}
				if(i == array.length - 1) {
					array[i][j] = 1;
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
