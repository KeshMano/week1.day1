package weeek1.day1.assignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 1;
		int range = 8;
		int sum = 0;

		System.out.println(firstNum);
		System.out.println(secondNum);

		for (int i = 2; i < range; i++) {
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.println(sum);
		}
	}
}
