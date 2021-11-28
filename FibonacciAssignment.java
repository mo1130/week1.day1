package week1.day1;

import java.util.Iterator;

public class FibonacciAssignment {

	public static void main(String[] args) {
		
	int range;
	int firstnum=0;
	int secondnum=1;
	
System.out.println(firstnum);
	
System.out.println(secondnum);
for (range = 1; range <=6; range++) {
	
	int total = firstnum+secondnum;
	
	firstnum=secondnum ;
	secondnum=total;
	System.out.println(total);
	
}

	}

}
