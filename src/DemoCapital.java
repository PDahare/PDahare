public class DemoCapital {

	public static void main(String[] args) {
		
		//System.out.println("************************");
		//some of integer value present in given string
		
		String s="1prashant33";
		int sum=0;
		for(int i=0; i<s.length(); i++)
		{
		char ch=s.charAt(i);
		if(Character.isDigit(ch)){
			sum=sum+ Character.getNumericValue(ch);
		}
	}
		System.out.println("sum "+sum);
	}
}

