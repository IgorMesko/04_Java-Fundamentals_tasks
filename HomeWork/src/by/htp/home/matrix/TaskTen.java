/*Найти положительные элементы главной диагонали квадратной матрицы.*/

package by.htp.home.matrix;

import java.util.Random;

public class TaskTen {

	public static void main(String[] args) {
		
		int n = 5;
		int m = 5;
		int[][] array = initArray(n, m);
		
		printArray(array);
		System.out.println("");
		System.out.println("Элементы, стоящие на диагонали:");
		printArrayDiag(array);
	}
	
	public static int[][] initArray(int n, int m) {
		Random random = new Random();

		int[][] array = new int[n][m];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				array[i][j] = random.nextInt(100)-50;
			}
		}
		return array;
	}
	
	public static void printArray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.printf("%5d", array[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static void printArrayDiag(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i][i] > 0) {
				System.out.printf("%5d", array[i][i]);
			}
		}
	}

}
