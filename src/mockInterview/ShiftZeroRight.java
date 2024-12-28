package mockInterview;

import java.util.Arrays;

public class ShiftZeroRight {
	
	public static int[] shiftZeroRightSide(int[] arr) {
		int n=arr.length;
		int count=0;
		for(int i=0; i<n; i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}
		while(count<n) {
			arr[count++]=0;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[]= {7,0,5,0,0,3,0,4};
		shiftZeroRightSide(arr);
		System.out.println("Output "+Arrays.toString(arr));
		
	}

}
