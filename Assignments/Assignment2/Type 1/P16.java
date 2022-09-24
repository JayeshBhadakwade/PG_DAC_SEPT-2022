import java.util.Scanner;

class P16
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows");
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print(j+" ");
			}
			if(i>1)
			System.out.println();
		}
	}
}
/*

Enter a number of rows
5
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1

*/