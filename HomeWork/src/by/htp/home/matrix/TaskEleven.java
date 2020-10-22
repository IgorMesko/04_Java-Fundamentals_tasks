/*Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.*/

package by.htp.home.matrix;

import java.util.Random;

public class TaskEleven {

	public static void main(String[] args) {
		
		int n = 10;
		int m = 20;
		int[][] array = initArray(n, m);
		int[] arr = countString(array);
		
		printArray(array);
		System.out.println("");

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 3) {
				System.out.println("Cтрока: " + i);
			}
		}
	}
	
	public static int[][] initArray(int n, int m) {
		Random random = new Random();

		int[][] array = new int[n][m];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(15);
			}
		}
		return array;
	}
	
	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%-5d", array[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static int[] countString(int[][] array) {
		int[] arr = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j] == 5) {;
					arr[i] = arr[i] + 1;
				}
			}
		}
		return arr;
	}
	
	
}
