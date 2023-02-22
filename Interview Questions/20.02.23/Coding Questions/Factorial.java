import java.util.*;


class Factorial
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value = ");
		int a = sc.nextInt();
		int i,fact=1;
		
		
		for(i=1;i<=a; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+ a +" is "+ fact);
	}
	
}