import java.util.*;


class PositiveOrNegative
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number =");
		int x = sc.nextInt();
		
		if(x >= 0 )
		{
			System.out.println("Number "+x+" is Positive");
		}
		else
		{
			System.out.println("Number "+x+" is Negative");
		}
	}
	
}