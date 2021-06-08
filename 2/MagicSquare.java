import java.util.Scanner;

public class MagicSquare {
	public static int[][] getArrayinputFromUser() {
		Scanner scanner = new Scanner(System.in);
		int[][] array = new int[3][3];
		System.out.println("Enter elements:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("a[" + i + "][" + j + "]=");
				array[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Array completed!");
		return array;

	}

	public static int findMinimumDifference(int[][] arr) {
		int[][][] possibleArrays = { { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } },
				{ { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } }, { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } },
				{ { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } }, { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } },
				{ { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } }, { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } },
				{ { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } }, };

		int min = 10000;
		for (int i = 0; i < 8; i++) {
			int x = FindSumOfDifference(arr, possibleArrays[i]);
			if (x < min)
				min = x;
		}
		return min;
	}

	public static int FindSumOfDifference(int[][] arr, int[][] possibleArray) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum = Math.abs(arr[i][j] - possibleArray[i][j]) + sum;
			}
		}
		return sum;
	}
	public static void printResult(int[][] array){
		System.out.println("The minimum difference is="+findMinimumDifference(array));
	}
	public static void main(String[] args) {
		int[][] inputArray=getArrayinputFromUser();
		printResult(inputArray);
	}
}
