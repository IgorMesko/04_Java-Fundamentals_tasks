/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.*/

package by.htp.home.matrix;

public class TaskTwelve {

	public static void main(String[] args) {
		
		int n = 6;
		int m = 6;
		int[][] array = initArray(n, m);
		
		printArray(array);
	}

	public static int[][] initArray(int n, int m) {
		int[][] array = new int[n][m];
		
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < j; i++) {
				array[i][j] = 1;
			}
		}
		return array;
	}
	
	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%-3d", array[i][j]);
			}
			System.out.println("");
		}
	}
}
