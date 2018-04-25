import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, num1;
		char answer;

		System.out.println("Please enter a name: ");
		String name = in.nextLine();
		do {
			System.out.println("Enter a number between 1-100: ");
			num = in.nextInt();

			if ((num > 1) && (num < 25)) {
				System.out.print(name + " your number is in range of 1-25 ");
			}
			if ((num > 25) && (num < 60)) {
				System.out.println(name + " your number is in range of 26-60 ");

			}

			else if ((num > 60) && (num < 100)) {
				System.out.print(name + " your number is greater than 60 ");

			} else
				System.out.println("Number not within 1-100");
			num1 = num % 2;
			if (num1 != 0) {
				System.out.print("and number is odd.");
			}
			if (num1 == 0) {
				System.out.print("and number is even.");

			}

			System.out.println("Would you like to continue (y/n)?");
			answer = in.next().charAt(0);
		} while ((answer != 'n') && (answer != 'N'));

		in.close();

	}
}
