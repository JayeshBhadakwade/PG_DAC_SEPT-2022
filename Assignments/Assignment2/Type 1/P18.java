import java.util.Scanner;
class P18
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows want to ptint");
		int n=sc.nextInt();
		for(int i=n;i>=0;i--)
		{
			for(char j='A';j<=(char)('A'+i);j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}

/*
OUTPUT:


Enter a number of rows want to print
5
A B C D E F
A B C D E
A B C D
A B C
A B
A
 
*/