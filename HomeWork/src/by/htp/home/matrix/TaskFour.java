		//  Сформировать квадратную матрицу по заданному образцу
		//  1	2	3	...	n
		//	n	n-1	n-2 ... n
		//  1	2	3	...	n
		//	n	n-1	n-2 ... n
		//	..	..	..	..	.
		// 	n	n-1	n-2 ... n

package by.htp.home.matrix;

public class TaskFour {

	public static void main(String[] args) {
		
		int n = 5;
		int m = 5;
		int[][] array = initArray(n, m);
		
		printArray(array);
		System.out.println("");
	}
	
	public static int[][] initArray(int n, int m) {
		int[][] array = new int[n][m];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(i % 2 == 0) {
					array[i][j] = j + 1;
				} else {
					array[i][j] = array.length - j;
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



