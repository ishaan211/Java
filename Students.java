class Students
{
	String name;
	int salary;
	static String company = "spacex";
	
	void setValue(String a, int b){
		name = a;
		salary = b;
	}
	
	void showResult(){
		System.out.println("Name = " + a);
		System.out.println("Salary = " + b);
		System.out.println("Company = " + company);
	}
	
	static public void main(String []e){
		Students st1 = new Students();
		st1.setValue("Ishaan", 200);
		st1.showResult();
		Students st2 = new Students();
		st2.setValue("Elon", 500);
		st2.showResult();
	}
}