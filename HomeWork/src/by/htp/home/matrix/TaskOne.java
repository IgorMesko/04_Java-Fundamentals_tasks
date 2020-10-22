/*Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.*/

package by.htp.home.matrix;

import java.util.Random;

public class TaskOne {

	public static void main(String[] args) {
		
		int n = 5;
		int m =5;
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
				array[i][j] = random.nextInt(100);
			}
		}
		return array;
	}
	
	public static void printArray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.printf("%-4d", array[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static void printArrayDiag(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%-4d", array[i][i]);
		}
	}
}
