package mockInterview;

import java.util.HashMap;
import java.util.Map;

//String charecter occurance count

public class StrOccCount {
	public static void main(String[] args) {
		
	String str="rameshwar";
	str=str.toLowerCase();
	Map<Character, Integer> word=new HashMap<>();
	for(char ch: str.toCharArray()) {
		if(word.containsKey(ch)) {
			word.put(ch, word.get(ch)+1);
			
		}else {
			word.put(ch, 1);
		}
	}
	System.out.println(word.toString());
		
	}
	}
