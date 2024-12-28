
public class string {

	public static void main(String[] args) {

		String str= "word";
		int count=1;
		for(int i=0; i<str.length(); i++)
		{
		  char c= str.charAt(i);
		  int j=count;
		  for (int k=1; k<=j; k++)
		  {
			  System.out.print(c);
		  }
		  System.out.println();
		  count++;
	}

	}
}
