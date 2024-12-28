package JavaSession;

public class ArunaQuestion {
	public static void main(String[] args) {
		

	int[] a= {1,2,3,4};
	int[] b= {5,6,7,8};
	
	//output 1,8,2,7,3,6,4,5,
	
	int result[]=new int[a.length+b.length];
	int index=0;
	for (int i=0; i<a.length; i++) {
		
		
		  result[index++]=a[i]; 
		  result[index++]=b[b.length-1-i];
		
		
	}
	for(int num: result) {
		System.out.print(num+",");
	}
	
	}
}
