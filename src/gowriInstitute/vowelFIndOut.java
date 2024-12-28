package gowriInstitute;

	//for given string find out number of vowels present
public class vowelFIndOut {

	public static int VowelCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		String str = "AEIOU";
		str=str.toLowerCase();
		System.out.println(VowelCount(str));
	}

}
