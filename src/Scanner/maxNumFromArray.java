package Scanner;

public class maxNumFromArray {
	public static void main(String[] args) {
		int arr[] = { 12, 23, -32, 43, 45, 98, 32, 344 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}
		}
		System.out.println("largest number from array is " + max);
	}

}
