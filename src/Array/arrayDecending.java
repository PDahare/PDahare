package Array;

public class arrayDecending {
	public static void main(String[] args)
	{
		//here is the input value 
		int arr[]= {81,5,3,67,-23,4};
		
		
		// Logic started 
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						
				}
			}
		}
		
		//here is the condition for output in a single line
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
	}
}
