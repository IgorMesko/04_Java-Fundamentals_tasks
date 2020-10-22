/*Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
строка слева направо, третья строка справа налево и так далее.*/

package by.htp.home.matrix;

import java.util.Random;

public class TaskThree {

	public static void main(String[] args) {
		
		int n = 5;
		int m = 5;
		int[][] array = initArray(n, m);
		
		printArray(array);
		System.out.println("");
		newArray(array);
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
	
	public static void newArray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(i % 2 != 0) {
					System.out.printf("%-4d", array[i][j]);
				} else {
					System.out.printf("%-4d", array[i][array.length - 1 - j]);
				}
			}
			System.out.println("");
		}
	}

}
