package gowriInstitute;

		/*In given string there are some digits are available, wherever the digits are available 
		  replace with UPPERCASE 'A' */
			
public class ReplaceDigitWithA {
	public static void main(String[] args) {
		String s="Ra88m14ram@789";
		System.out.println(DigitReplaceByA(s));
	}

	
	public static String DigitReplaceByA(String s) {
		String result = "";
		
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			
			 if(Character.isDigit(ch)) {
				result=result+'A';
			}else {
				result=result+ch;
			}
		}
		return result;
		
	}
	
	
}
