package week1.day1;

public class Mobile {
	
	public void makeCall() {
		System.out.println("printed1");
		
	}
	public void sendMsg() {
		System.out.println("printed2");
		
}
	public static void main(String[] args) {
		Mobile obj1 = new Mobile();
		Mobile obj2 = new Mobile();
		obj1.makeCall();
		obj2.sendMsg();
		
		
		
	}

}
