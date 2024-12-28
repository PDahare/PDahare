
public class AdditionofTwoNumber 
{
	public static void main(String[] args) 
	{
		int number1=22;
		int number2=32;
		int result;
		
		result= number1 + number2; //+ and =
		
		System.out.println(result);
		
		
		//addition of array
		int[] a= {2,3,4,5,10};
		int sum=0;
		for(int i=0; i<a.length; i++){
		 sum=a[i]+sum;
		}
		System.out.println(sum);
	}

}
