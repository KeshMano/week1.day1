package weeek1.day1.assignments;

public class PositiveOrNegative {

	public static void main(String[] args) {
		int number = 35;
		if (number >= 0) {
			System.out.println("The Number is Positive");
		} else if (number < 0) {
			System.out.println("The Number is Negative");
		} else if (number >= 0 && number < 0) {
			System.out.println("The Number is neither Positive nor Negative");
		}
	}

}
