package Array;

public class secLargestNum {
	
	public static void main(String[] args) {
		int[] arr= { -200, 200, 20, 101, 14, 30, 18,299, 50, 80, 23, 77, 201 };
		int max=arr[0];
		int secMax=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max)
			{
				secMax=max;
				max=arr[i];
			}
			else if (arr[i]<max && arr[i]>secMax) {
				secMax=arr[i];
			}
					
		}
		System.out.println("Maximum from array :"+max);
		System.out.println("Second Maximum from array :"+secMax);
		
	}
}
