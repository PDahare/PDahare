

public class Variables {
	
	    
	  int a = 20;  // Instance variable (global within the class)

	    public int chethan() {
	        int b = 20;  // Local variable to the method chethan
	        System.out.println(b);  // Prints the value of local variable b (20)
	        a = 420;  // Modifies the instance variable a to 420
	        System.out.println(a);  // Prints the modified value of instance variable a (420)
	        return b;  // Returns the local variable b
	    }

	    public static void main(String[] args) {
	    	Variables ob = new Variables();  // Creating an object of Local_Golbal class
	        int b = ob.chethan();  // Calling the chethan method and storing its return value in local variable b
	        System.out.println(ob.a);  // Prints the value of instance variable a (420)
	        System.out.println(b);  // Prints the value of local variable b returned by chethan (20)
	    
	    int i=20;
	    int j=20;
	    	String s= new String("prashant");
	    	String s3="prashant";
	    	StringBuffer s2=new StringBuffer("prashant");
	    	
	    	String s4="prashant";
	    	//System.out.println(s==s2);  //false
	    	System.out.println(s3==s4);	//true
	    	System.out.println(i==j);	//true
	    	System.out.println(s4.equals(s));	//true
	    	System.out.println(s3.equals(s4));	//true
	    	System.out.println(s2.equals(s3));	//false
	    	
	    }
	}



