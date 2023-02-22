import java.util.*;

class Digits
{

	public static void main(String[] args)
    {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int number = sc.nextInt();
 
        // Printing the last digit of the number
        while (number > 0) {
 
            // Finding the remainder (Last Digit)
            int remainder = number % 10;
 
            // Printing the remainder/current last digit
            System.out.println(remainder);
 
            // Removing the last digit/current last digit
            number = number / 10;
        }
    }
	
}