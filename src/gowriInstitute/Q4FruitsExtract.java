package gowriInstitute;

 //U have given four fruits name with delimeter (,) print first fruit and last fruit
public class Q4FruitsExtract {
	public static void main(String[] args) {
		String input1 = "Apple,Banana,Kivi,anar,mango";

		//input1 = input1.replaceAll("Apple,", "");
		
		//System.out.println(input1);
		 String[] fruits = input1.split(",");
		 
		FruitsExtract1stLast(fruits);

	}

	 public static void FruitsExtract1stLast(String[] fruits) {
		 String s="";
		for (int i = 0; i < fruits.length; i++) {
			 if (i>0) {
				s=fruits[i]+",";
			}
				System.out.print(s);
				
			}
		

		String firstFruit=fruits[0];
		String lastFruit=fruits[fruits.length-1];
		System.out.println(firstFruit);
		System.out.println(lastFruit);
	

		} 
}
