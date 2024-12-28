
public class StrUPPtoLOWnVICEVERSA {
	public static void main(String[] args) {
		System.out.println(StrUPPtoLOWn("PraShant"));
	}
	public static String StrUPPtoLOWn(String input) {
		
		StringBuffer sb=new StringBuffer();
		for(int i=0; i<input.length(); i++) {
			char ch=input.charAt(i);
			if(ch>='A' && ch<='Z') {
				sb.append((char)(ch+ 32));
			}else if(ch>='a' && ch<='z') {
				sb.append((char)(ch-32));
			}else {
				sb.append(ch);
			}
		}
		
		return sb.toString();
		
	}
	
}
