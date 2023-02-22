// Java program to find LCM of two numbers.
import java.util.*;
public class LCMPrimeMethod
{
    // Recursive method to return gcd of a and b
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b; 
        return gcd(b % a, a); 
    }
      
    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
      
    // Driver method
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number = ");
		int a = sc.nextInt();
		System.out.print("Enter second number = ");
		int b = sc.nextInt();
        //int a = 15, b = 20;
        System.out.println("LCM of " + a +
                           " and " + b + 
                      " is " + lcm(a, b));
    }
}