/*Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/

package by.htp.home.matrix;

import java.util.Random;

public class TaskTwo {

	public static void main(String[] args) {
		
		int n = 5;
		int m = 5;
		int k = 2;
		int p = 3;
		int[][] array = initArray(n,m);

		printArray(array);
		System.out.println("");
		System.out.println("Строка К:");
		printString(array, k);
		System.out.println("");
		System.out.println("Столбец P:");
		printColumn(array, p);
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
	
	public static void printString(int[][] array, int k) {
		for(int i = k; i < array.length;) {
			for(int j = 0; j < array.length; j++) {
				System.out.printf("%-4d", array[i][j]);
			}
			System.out.println(" ");
			break;
		}
	}
	
	public static void printColumn(int[][] array, int p) {
		for(int i = 0; i < array.length; i++) {
			for(int j = p; j < array.length;) {
				System.out.printf("%-4d", array[i][j]);
				break;
			}
			System.out.println(" ");
		}
	}
	
}
