import java.util.Scanner; 
 
public class SmallestOf3 
{  
	public static void main(String args[])  
	{  
		
		int a, b, c, smallest, temp;  
		//object of the Scanner class  
		Scanner sc = new Scanner(System.in);  
		//reading input from the user  
		System.out.print("Enter the first number:");  
		a = sc.nextInt();  
		System.out.print("Enter the second number:");  
		b = sc.nextInt();  
		System.out.print("Enter the third number:");  
		c = sc.nextInt();  
		//comparing a and b and storing the smallest number in a temp variable  
		temp=a<b?a:b;  
		//comparing the temp variable with c and storing the result in the variable names smallest  
		smallest=c<temp?c:temp;  
		//prints the smallest number  
		System.out.println("The smallest number is: "+smallest);  

	}  
 
}  
  