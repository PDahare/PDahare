package mockInterview;

public class ReverseInt {
	
	public static int getReverseInt(int input) {
		int reverse=0;
		while(input!=0) {
			int digit=input %10;
			reverse=(reverse*10)+digit;
			input=input/10;
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		int input=1234;
		
		System.out.println(getReverseInt(input));
	}

}
