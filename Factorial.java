package weeek1.day1.assignments;

public class Factorial {
	public static void main(String[] args) {
		int input = 5;
		int fact = 1;
		for (int i = 1; i <= input; i++) {
			fact = fact * i;
			System.out.println(fact);
		}
		System.out.println("Factorial 5*4*3*2*1 = " + fact);
	}
}
