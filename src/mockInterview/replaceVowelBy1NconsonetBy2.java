package mockInterview;

public class replaceVowelBy1NconsonetBy2 {
	public static void main(String[] args) {
		String input="Abhinav";
		replaceVowelBy1AndConsonetBy2(input.toLowerCase());
	}

	private static void replaceVowelBy1AndConsonetBy2(String input) {

		StringBuffer sb=new StringBuffer();
		for(char c: input.toCharArray()) {
			if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u') {
				sb.append(1);
			}else {
				sb.append(2);
			}
		}
		System.out.println(sb.toString());
		
	}

}
