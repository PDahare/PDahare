package mockInterview;

public class additionArrayElement {

	public static void main(String[] args) {
		int arr[]= {4, 5, 9, 20,0};
		int sum=0;
		for (int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
