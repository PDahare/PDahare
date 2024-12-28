package mockInterview;

import java.util.HashMap;
import java.util.Map;

	//number ocurrance count 
public class IntOccuCount {
	public static void main(String[] args) {
		int[] numbers = { 2, 4, 5, 2, 6, 8, 9, 6 };
		
		Map<Integer, Integer> num=new HashMap<>();
		for(int number : numbers) {
			if(num.containsKey(number)) {
				num.put(number, num.get(number)+1);
			}else {
				num.put(number, 1);
			}
			
		}
		System.out.println(num);
	}
}
