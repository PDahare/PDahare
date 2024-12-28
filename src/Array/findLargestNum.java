package Array;

public class findLargestNum {

	public static int largestNum(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[] = { -200, 200, 20, 101, 14, 30, 18, 50, 80, 23, 77, 201 };
		int largestNum = largestNum(arr);
		System.out.println(largestNum);
	}
}
