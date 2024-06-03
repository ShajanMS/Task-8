package guvi;

public class Task8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
        int b = 10;
        int c = 3;
        int d = 7;
        
        // Calculate the sums
        int sumAB = a + b;
        int sumCD = c + d;
        
        // Check if sum of a and b is greater than sum of c and d
        if (sumAB > sumCD) {
            // Output the message if the condition is true
            System.out.println("The sum of a and b is greater than the sum of c and d.");
        } else {
            // Optionally, you can also add an else statement to handle the other cases
            System.out.println("The sum of a and b is not greater than the sum of c and d.");
        }
    }
}