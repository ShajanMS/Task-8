package guvi;

import java.util.Scanner;

public class Task8_4 {

	public static void main(String[] args) {
		 
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Original values: number 1 = " + number1 + ", number 2 = " + number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("Swapped values: number 1 = " + number1 + ", number 2 = " + number2);
        scanner.close();
    }
}