
public class FindWithMethod {
	String str ="hello my name is faraz and I am a silly boy and I want to go to suez";
	int count=0;
	int county=0;
	int countz=0;
	void getTotalWordCount(){
		for(int i=0;i < str.length();i++){
			char ch = str.charAt(i);
			if(str.charAt(i)==' ' && str.charAt(i)!==' '{
				count++;
			}
			
		}
	}
	void getWordsEndingInY(){
		for(int i = 0; i<str.length(); i++){
			char ch= str.charAt(i);
			if(str.charAt(i)-1=='y'){
				county++;
			}
	}
	}
	void getWordsEndingInZ(){
		for(int i = 0; i<str.length(); i++){
			char ch= str.charAt(i);
			if(str.charAt(i)-1=='z'){
				countz++;
			}
	}
	}
	void dispWordCount(){
		System.out.println("Total words are: "+count);
		System.out.println("Total Y's are: "+county);
		System.out.println("Total Z's are: "+countz);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindWithMethod obj = new FindWithMethod();
		obj.getTotalWordCount();
		obj.getWordsEndingInY();
		obj.getWordsEndingInZ();
		obj.dispWordCount();
	}

}
