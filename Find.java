
public class Find {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hey";
		String str2 = "maven";
		String str3 = "tez";
		String str4 = "miniature";
		String str5 = "ray";
		String str6 = "rule";
		int count =0;
		 if(str1.endsWith("y")||str1.endsWith("z")) {
			count++;
		 }
		 if(str2.endsWith("y")||str2.endsWith("z")) {
				count++;
			 }
		 if(str3.endsWith("y")||str3.endsWith("z")) {
				count++;
			 }
		 if(str4.endsWith("y")||str4.endsWith("z")) {
				count++;
			 }
		 if(str5.endsWith("y")||str5.endsWith("z")) {
				count++;
			 }
		 if(str6.endsWith("y")||str6.endsWith("z")) {
				count++;
			 }
		 System.out.println("total: "+count);
	}
	

}
