		//  Сформировать квадратную матрицу по заданному образцу
		//  0	0	0	...	0 0 1
		//	0	0	0   ... 0 2 0
		//  0	0	0	...	3 0 0
		//	..	..	..	..	.
		// 	0	0 	n-1 ... 0 0 0


package by.htp.home.matrix;

public class TaskFive {

	public static void main(String[] args) {
		
		int count = 1;
		int n = 6;
		int m = 6;
		int[][] array = initArray(n, m, count);
		
		printArray(array);
	}
	
	public static int[][] initArray(int n, int m, int count) {
		int[][] array = new int[n][m];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(i + j + 1 == n) {
					array[i][j] = count++;
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
