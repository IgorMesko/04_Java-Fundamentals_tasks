		//  х1     х2   х3 ... хn
		//	х1^2 х2^2 х3^2 ... хn^2 
		//  х1^3 х2^3 х3^3 ... хn^3 
		//	..	..	..	..	.
		// 	х1^n х2^n х3^n ... хn^n 

package by.htp.home.matrix;

public class TaskNine {

	public static void main(String[] args) {
		
		int n = 5;
		int m = 5;
		int[][] array = initArray(n, m);
		
		printArray(array);
	}

	public static int[][] initArray(int n, int m) {
		int[][] array = new int[n][m];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
					array[i][j] = (int) Math.pow(j+1, i+1);
				}
			}
		return array;
	}

	public static void printArray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.printf("%-6d", array[i][j]);
			}
			System.out.println("");
		}
	}
}
