package weeek1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		for (int i = 2; i <=7; i++) {
			int x = input % i;
			if (x == 0) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("Prime");
		} else {
			System.out.println("Not a Prime");
		}
	}

}
