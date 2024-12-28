
public class RefVar {

	public static void main(String[] args) {
		//swap variable
		String s1="Basavaraj";
		String s2="Prashant";
		s2 =s1.concat(s2);
	
		s1=s2.substring(9);
		System.out.println("I am S1: "+s1);
		s2=s2.substring(0, 9);
		System.out.println("I am S2: "+s2);

	}

}
