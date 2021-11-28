package week1.day1;

public class MobileVariable {
	String mobileModel = "keypad";
	int mobileWeight = 150;
	boolean isfullcharge = false;
	double mobilecost = 1000.88;
	
	
		

	public static void main(String[] args) {
		MobileVariable mob= new MobileVariable();
		
		System.out.println(mob.mobileModel);
		
		System.out.println(mob.mobileWeight);
		System.out.println(mob.isfullcharge);
		System.out.println(mob.mobilecost);

	}

}
