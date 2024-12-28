
public class reverseString 
{
	// reverse string sentence
	public static void main(String[] args)
	{
		String strInput="India is my country";
		String output="";
		String[] inputArray=strInput.split(" ");
		for (String word:inputArray)
		{
			System.out.println(word);
			
		}
		for (int i=inputArray.length-1; i>=0; i--)
		{
			output=output+" "+inputArray[i];
		}
		
		System.out.println(output.trim());
		
	}
}



