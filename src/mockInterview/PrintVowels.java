package mockInterview;

public class PrintVowels {
	
	public static String printVowels(String input) {
		String vowels="";
		input=input.toLowerCase();
		for(int i=0; i<input.length(); i++) {
			char ch=input.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u') {
				vowels=vowels+ch;
			}
		}return vowels;
	}
	
	public static void main(String[] args) {
		String input="GoodEvening";
		System.out.println(printVowels(input));
	}

}
