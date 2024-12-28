package mockInterview;

public class reverseStringSentence {
	public static void main(String[] args) {
		
	String str="Benglore and Nagpur";
	String rev="";
	String[] str1=str.split(" ");
	for(String s : str1)
	{
		System.out.println(s);
	}
	
	for(int i=str1.length-1; i>=0; i--)
	{
		rev=rev+" "+ str1[i];
		
	}
	//System.out.println(rev);
	System.out.println(rev.trim());
	}
}
