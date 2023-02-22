import java.util.*;

class SwappingNumber1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number a = ");
		int a = sc.nextInt();
		System.out.print("Enter second number b = ");
		int b = sc.nextInt();
		
		a = a+b;
		b = a-b;
		a= a-b;
		System.out.println("Now Value of a is = "+a);
		System.out.println("Now Value of b is = "+b);
		
		
	}
	
}