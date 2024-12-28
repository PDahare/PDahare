package JavaSession;

public class findOutcountOfO {
	
	public static void main(String[] args) {
		String str="hello, welcome to the java programming";
		int count = 0;
		int charcount=0;
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch=='o') {
				count++;
			}
			if(ch!=' ') {
				charcount++;
			}

		}
		System.out.println(count);
		System.out.println(charcount);
		
	}

}

