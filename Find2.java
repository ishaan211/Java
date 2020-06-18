
public class Find2 {
	static String str ="hello my name is faraz and I am a silly boy and I want to go to suez";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int county =1;
		int countz =1;
		
		
		for(int i = 0; i<str.length(); i++){
			char ch= str.charAt(i);
			
			if(str.charAt(i)-1=='y'){
				county++;
			}
			if(str.charAt(i)-1=='z'){
				countz++;
			}
		
			}
		System.out.println("Y's are: "+county);
		System.out.println("Z's are: "+countz);
			}
		
	}
		


