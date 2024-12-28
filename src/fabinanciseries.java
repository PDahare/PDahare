
public class fabinanciseries {
	public static void main(String[] args)
	{
		int firstNum=0;
		int secNum=1;
		int nextNum;
		System.out.print(firstNum +", "+secNum);
		int numTerm=10;
		for (int i=0; i<numTerm; i++)
		{
			nextNum=firstNum+secNum;
		
			System.out.print(", "+nextNum);
			firstNum=secNum;
			secNum=nextNum;
			
		}
	}

}
