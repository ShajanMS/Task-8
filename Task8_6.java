package guvi;

import java.util.Scanner;

public class Task8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	       
	        long factorial = calculateFactorial(number);

	        System.out.println(number + "! = " + factorial);
	        
	        scanner.close();
	    }

	    public static long calculateFactorial(int number) {
	        long factorial = 1;
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	        }
	        return factorial;

	}

}
