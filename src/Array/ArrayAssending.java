package Array;

public class ArrayAssending
{
	
	//From here logic is started for assending order
	
		public static void main(String[] args)
		{
	     int arr[]= {35,88,53,-43,5,9};
	     
	     
	     for (int i=0; i<arr.length; i++)
	     {
	    	 
	    	for (int j=0; j<arr.length-1; j++)
	    	{
	    		if ( arr[j]>arr[j+1])
	    		{
	    			int temp = arr[j];
	    			arr[j]=arr[j+1];
	    			arr[j+1]=temp;
	    			
	    			
	    		}
	    	}
	     }
	    		 
			for (int i=0; i<arr.length; i++)
			{
				System.out.print(arr[i]+" ");
				
			}
			
		}
}
