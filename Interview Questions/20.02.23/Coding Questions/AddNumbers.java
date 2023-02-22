import java.util.*;

class AddNumbers
{
	
	static int add(int a, int b)
    {
       
        for (int i = 1; i <= b; i++)
            a++;
        return a;
    }
 
    public static void main(String[] args)
    {
     
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number = ");
		int x = sc.nextInt();
		System.out.print("Enter the second number = ");
		int y = sc.nextInt();
		
        int a = add(x, y);
        System.out.print(a);
    }
	
}