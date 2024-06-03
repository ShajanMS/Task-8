package guvi;

import java.util.Scanner;

public class Task8_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Count the number of digits
        int digitCount = countDigits(number);

        // Print the result
        System.out.println("The number of digits in " + number + " is: " + digitCount);

        // Close the scanner
        scanner.close();
    }

    // Method to count the number of digits in an integer
    public static int countDigits(int number) {
        // Handle negative numbers by converting them to positive
        if (number < 0) {
            number = -number;
        }

        // Handle the special case where the number is 0
        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            number /= 10; // Remove the last digit
            count++;
        }

        return count;

	}

}
