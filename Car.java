public class Car {
int gear;
int speed;
char direc;
void chanGear(int newValue) {
	gear = newValue;
}
void chanSpeed(int newValue) {
	speed = newValue;
}
void chanDirec(char newValue) {
	direc = newValue;
}
void printStates() {
    System.out.println("gear:" +
       gear + " speed:" + 
        speed + " direction:" + direc);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		
		//invoking the methids
		c1.chanDirec(n);
		c1.chanGear(2);
		c1.chanSpeed(50);
		c1.printStates();
	
	}

}