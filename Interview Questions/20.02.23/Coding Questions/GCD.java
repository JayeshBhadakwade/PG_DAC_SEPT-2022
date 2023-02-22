import java.util.*;

public class GCD  
{  
	public static void main(String[] args)   
	{  
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number = ");
		int n1 = sc.nextInt();
		System.out.print("Enter second number = ");
		int n2 = sc.nextInt();
		//int n1=50, n2=60;  
		while(n1!=n2)   
		{  
			if(n1>n2)  
				n1=n1-n2;  
			else  
				n2=n2-n1;  
		}  
	System.out.printf("GCD of n1 and n2 is: " +n2);  
	}  
}  